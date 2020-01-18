package com.lws.android.jiayou;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Dimension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ArrangeActivity extends BaseActivity implements View.OnClickListener {
    String stage;
    String part;

    LinearLayout sentenceLinearLayout;
    TextView meaningTextView;
    LinearLayout wordLinearLayout;
    TextView remainingTextView;

    Stack<ArrangeData> arrangeDataStack;

    ArrangeData arrangeData;
    ArrayList<String> answer;
    ArrayList<String> arrange;

    @Override
    protected void init() {
        setContentView(R.layout.activity_arrange);

        Intent intent = getIntent();
        stage = intent.getStringExtra(Constants.EXTRA_STAGE);
        part = intent.getStringExtra(Constants.EXTRA_PART);

        sentenceLinearLayout = findViewById(R.id.ll_sentence);
        meaningTextView = findViewById(R.id.tv_meaning);
        wordLinearLayout = findViewById(R.id.ll_word);
        remainingTextView = findViewById(R.id.tv_remaining);

        ArrayList<ArrangeData> arrangeDataArrayList = DataLoader.loadArrangeData(stage, part);
        arrangeDataStack = new Stack<>();
        for (ArrangeData arrangeData : arrangeDataArrayList) {
            arrangeDataStack.push(arrangeData);
        }
        Collections.shuffle(arrangeDataStack);

        setField();
    }

    private void setField() {
        if (!arrangeDataStack.empty()) {
            sentenceLinearLayout.removeAllViews();
            arrange = new ArrayList<>();

            arrangeData = arrangeDataStack.pop();
            meaningTextView.setText(arrangeData.getMeaning());

            answer = new ArrayList<>(arrangeData.getChoices());
            ArrayList<String> choices = new ArrayList<>(answer);
            Collections.shuffle(choices);

            wordLinearLayout.removeAllViews();

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(3,0,3,0);
            params.weight = 1f;
            int btnBG = R.drawable.green_btn;

            for (String choice : choices) {

                Button button = new Button(this);
                button.setLayoutParams(params);
//                button.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,1f));
                button.setTextSize(Dimension.SP,20);
                button.setBackgroundResource(btnBG);
                button.setText(choice);
                button.setTag(choice);
                button.setOnClickListener(this);
                wordLinearLayout.addView(button);
            }

            remainingTextView.setText(getString(R.string.remaining, arrangeDataStack.size()));
        } else {
            finish();
        }
    }

    @Override
    public void onClick(View v) {
        if (arrange.size() != answer.size()) {
            String choice = (String) v.getTag();
            arrange.add(choice);
            TextView textView = new TextView(this);
            textView.setTextColor(Color.BLACK);
            textView.setTextSize(22);
            textView.setText(choice);
            sentenceLinearLayout.addView(textView);
            wordLinearLayout.removeView(v);
        }
        if (arrange.size() == answer.size()) {
            if (arrange.equals(answer)) {
                Toast.makeText(this, "정답!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "오답...", Toast.LENGTH_SHORT).show();
            }
            setField();
        }
    }
}
