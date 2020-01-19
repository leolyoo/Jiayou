package com.lws.android.jiayou;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class hskWordAdapter extends BaseAdapter {
    ArrayList<hskWord> hsk;
    Context context;


    public  hskWordAdapter(Context context, ArrayList<hskWord> hsk){
    this.context = context;
    this.hsk = hsk;
    }

    @Override
    public int getCount() {
        return hsk.size();
    }

    @Override
    public Object getItem(int position) {
        return hsk.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hsk_word, parent, false);

        TextView charText, pronunText, meanText;
        charText = convertView.findViewById(R.id.hsk_character);
        pronunText = convertView.findViewById(R.id.hsk_pronunciation);
        meanText = convertView.findViewById(R.id.hsk_meaning);

        final hskWord hskWord = hsk.get(position);

        charText.setText(hskWord.getCharacter());
        pronunText.setText(hskWord.getPronunciation());
        meanText.setText(hskWord.getMeaning());

        return convertView;
    }

}
