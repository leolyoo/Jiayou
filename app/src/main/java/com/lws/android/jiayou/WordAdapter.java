package com.lws.android.jiayou;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordAdapter extends BaseAdapter {
    ArrayList<Word> words;
    Context context;

    public WordAdapter(Context context, ArrayList<Word> words) {
        this.context = context;
        this.words = words;
    }

    @Override
    public int getCount() {
        return words.size();
    }

    @Override
    public Object getItem(int position) {
        return words.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_word, parent, false);

        TextView characterTextView = convertView.findViewById(R.id.tv_character);
        TextView pronunciationTextView = convertView.findViewById(R.id.tv_pronunciation);
        TextView meaningTextView = convertView.findViewById(R.id.tv_meaning);
        ImageButton writeButton = convertView.findViewById(R.id.btn_write);
        ImageButton ttsButton = convertView.findViewById(R.id.btn_tts);

        final Word word = words.get(position);

        characterTextView.setText(word.getCharacter());
        pronunciationTextView.setText(word.getPronunciation());
        meaningTextView.setText(word.getMeaning());
        final int gifId = word.getGifId();

        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WriteActivity.class);
                intent.putExtra(Constants.EXTRA_WORD, gifId);
                context.startActivity(intent);
            }
        });

        ttsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String utteranceId = this.hashCode() + "";
                int status = GlobalApplication.getInstance().getTts().speak(word.getCharacter(), TextToSpeech.QUEUE_FLUSH, null, utteranceId);
                if (status != TextToSpeech.SUCCESS) {
                    Toast.makeText(GlobalApplication.getInstance().getApplicationContext(), "TTS 오류", Toast.LENGTH_LONG).show();
                }
            }
        });

        return convertView;
    }
}
