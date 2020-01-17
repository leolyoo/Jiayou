package com.lws.android.jiayou;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MatchingActivity extends BaseActivity implements View.OnClickListener {
    Stack<WordQuiz> wordQuizzes;
    TextView lifeTextView, questionTextView, pronunciationTextView, remainingTextView;
    Button choiceButton1, choiceButton2, choiceButton3, choiceButton4;

    String stage, part;

    int life;
    String answer;

    String choice1;
    String choice2;
    String choice3;
    String choice4;

    @Override
    protected void init() {
        setContentView(R.layout.activity_matching);

        Intent intent = getIntent();
        stage = intent.getStringExtra(Constants.EXTRA_STAGE);
        part = intent.getStringExtra(Constants.EXTRA_PART);

        lifeTextView = findViewById(R.id.text_life);
        questionTextView = findViewById(R.id.text_question);
        pronunciationTextView = findViewById(R.id.text_pronunciation);
        remainingTextView = findViewById(R.id.tv_remaining);

        choiceButton1 = findViewById(R.id.button_choice_1);
        choiceButton2 = findViewById(R.id.button_choice_2);
        choiceButton3 = findViewById(R.id.button_choice_3);
        choiceButton4 = findViewById(R.id.button_choice_4);

        wordQuizzes = new WordQuizGenerator(DataLoader.loadWords(stage, part)).generate();

        choiceButton1.setOnClickListener(this);
        choiceButton2.setOnClickListener(this);
        choiceButton3.setOnClickListener(this);
        choiceButton4.setOnClickListener(this);

        life = 3;

        setFields();
    }

    private void setFields() {
        if (wordQuizzes.empty()) {
            complete();
            return;
        }
        WordQuiz wordQuiz = wordQuizzes.pop();

        questionTextView.setText(wordQuiz.getQuestion());
        answer = wordQuiz.getAnswer();
        pronunciationTextView.setText(wordQuiz.getPronunciation());

        choice1 = wordQuiz.getChoices().get(0);
        choice2 = wordQuiz.getChoices().get(1);
        choice3 = wordQuiz.getChoices().get(2);
        choice4 = wordQuiz.getChoices().get(3);
        choiceButton1.setText(choice1);
        choiceButton2.setText(choice2);
        choiceButton3.setText(choice3);
        choiceButton4.setText(choice4);

        lifeTextView.setText(getString(R.string.life, life));
        remainingTextView.setText(getString(R.string.remaining, wordQuizzes.size()));

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_choice_1:
                check(choice1);
                break;
            case R.id.button_choice_2:
                check(choice2);
                break;
            case R.id.button_choice_3:
                check(choice3);
                break;
            case R.id.button_choice_4:
                check(choice4);
                break;
        }
    }

    private void check(String choice) {
        if (!choice.equals(answer) && life > 0) {
            life--;
            Toast.makeText(this, "오답...", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "정답!", Toast.LENGTH_SHORT).show();
        }
        if (life <= 0) {
            over();
        } else {
            setFields();
        }
    }

    private void over() {
        Toast.makeText(this, "실패...", Toast.LENGTH_SHORT).show();
        finish();
    }

    private void complete() {
        Toast.makeText(this, "통과!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
