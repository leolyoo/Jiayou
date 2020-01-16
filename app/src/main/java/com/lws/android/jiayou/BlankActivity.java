package com.lws.android.jiayou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Stack;

public class BlankActivity extends BaseActivity implements View.OnClickListener {

    Stack<BlankQuiz> blankQuizzes = new Stack<>();
    TextView lifeTextView, questionTextView, pronunciationTextView, remainingTextView, meaningTextView;
    Button button1, button2, button3, button4;

    String stage, part;
    int life = 5;
    String question;
    String answer;
    String pronunciation;
    String meaning;

    String choice1;
    String choice2;
    String choice3;
    String choice4;

    State state;

    enum State {
        Solving, Finished
    }

    protected void init() {
        setContentView(R.layout.activity_blank);

        Intent intent = getIntent();
        stage = intent.getStringExtra(Constants.EXTRA_STAGE);
        part = intent.getStringExtra(Constants.EXTRA_PART);


        lifeTextView = findViewById(R.id.text_life);
        questionTextView = findViewById(R.id.blank_quiz);
        pronunciationTextView = findViewById(R.id.blank_pronunciation);
        meaningTextView = findViewById(R.id.blank_meaning);
        remainingTextView = findViewById(R.id.text_remaining);

        button1 = findViewById(R.id.button_choice_1);
        button2 = findViewById(R.id.button_choice_2);
        button3 = findViewById(R.id.button_choice_3);
        button4 = findViewById(R.id.button_choice_4);

        Serializable serializable = getIntent().getSerializableExtra("blanksQuizzes");
        if (serializable instanceof HashSet<?>) {
            for (Object obj : (HashSet<?>) serializable) {
                if (obj instanceof BlankQuiz) {
                    blankQuizzes.push((BlankQuiz) obj);
                }
            }
        }

        initialize();

    }

    private void initialize() {
        life = 5;
        state = State.Solving;
        setFields();
        display();
    }

    private void setFields() {
        if (state == State.Solving) {
            BlankQuiz blankQuiz = blankQuizzes.pop();
            question = blankQuiz.getQuestion();
            answer = blankQuiz.getAnswer();
            pronunciation = blankQuiz.getPronunciation();
            meaning = blankQuiz.getMeaning();

            if (blankQuiz.getChoices().size() > 0) {
                choice1 = blankQuiz.getChoices().get(0);
                button1.setOnClickListener(this);
            } else {
                choice1 = "";
                button1.setOnClickListener(null);
            }
            if (blankQuiz.getChoices().size() > 1) {
                choice2 = blankQuiz.getChoices().get(1);
                button2.setOnClickListener(this);
            } else {
                choice2 = "";
                button2.setOnClickListener(null);
            }
            if (blankQuiz.getChoices().size() > 2) {
                choice3 = blankQuiz.getChoices().get(2);
                button3.setOnClickListener(this);
            } else {
                choice3 = "";
                button3.setOnClickListener(null);
            }
            if (blankQuiz.getChoices().size() > 3) {
                choice4 = blankQuiz.getChoices().get(3);
                button4.setOnClickListener(this);
            } else {
                choice4 = "";
                button4.setOnClickListener(null);
            }
        }
    }

    private void display() {
        if (state == State.Solving) {
            String s = "♥ × " + life;
            lifeTextView.setText(s);
            questionTextView.setText(question);
            pronunciationTextView.setText(pronunciation);
            meaningTextView.setText(meaning);
            s = "남은 퀴즈 : " + blankQuizzes.size();
            remainingTextView.setText(s);

            button1.setText(choice1);
            button2.setText(choice2);
            button3.setText(choice3);
            button4.setText(choice4);
        }
    }

    @Override
    public void onClick(View v) {
        if (state == State.Solving) {
            String choice;
            switch (v.getId()) {
                case R.id.button_choice_1:
                    choice = choice1;
                    break;
                case R.id.button_choice_2:
                    choice = choice2;
                    break;
                case R.id.button_choice_3:
                    choice = choice3;
                    break;
                case R.id.button_choice_4:
                    choice = choice4;
                    break;
                default:
                    return;
            }
            if (!choice.equals(answer)) {
                life--;
                Toast.makeText(this, "오답...", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "정답!", Toast.LENGTH_SHORT).show();
            }
            if (life > 0 && blankQuizzes.size() > 0) {
                setFields();
                display();
            } else {
                display();
                state = State.Finished;
                new Thread(new Runnable() {
                    @Override

                    public void run() {
                        SystemClock.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent;

                                //분기점 life로 판단해서 다음 스테이지 조정

                                if (life == 0) {
                                    intent = new Intent(getApplicationContext(), PartActivity.class);
                                    intent.putExtra(Constants.EXTRA_STAGE, stage);
                                    intent.putExtra(Constants.EXTRA_PART, part);
                                    startActivity(intent);

                                } else {
                                    intent = new Intent(getApplicationContext(), PartActivity.class);
                                    intent.putExtra(Constants.EXTRA_STAGE, stage);
                                    intent.putExtra(Constants.EXTRA_PART, part);
                                    startActivity(intent);
                                }
                                finish();
                            }
                        });
                    }
                }).start();
            }
        }
    }
}
