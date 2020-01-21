package com.lws.android.jiayou;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class ExamActivity extends BaseActivity {
    String stage;
    Exam exam;
    int life;

    View.OnClickListener cl;

    @Override
    protected void init() {
        stage = getIntent().getStringExtra(Constants.EXTRA_STAGE);
        exam = new Exam(this, stage);

        life = 6;

        setMatching();
    }

    private void setMatching() {
        if (!exam.getWordQuizzes().empty() && life > 0) {
            setContentView(R.layout.activity_matching);
            TextView lifeTextView = findViewById(R.id.text_life);
            TextView questionTextView = findViewById(R.id.text_question);
            TextView pronunciationTextView = findViewById(R.id.text_pronunciation);
            TextView remainingTextView = findViewById(R.id.tv_remaining);
            Button choiceButton1 = findViewById(R.id.button_choice_1);
            Button choiceButton2 = findViewById(R.id.button_choice_2);
            Button choiceButton3 = findViewById(R.id.button_choice_3);
            Button choiceButton4 = findViewById(R.id.button_choice_4);

            choiceButton1.setTextSize(25);
            choiceButton2.setTextSize(25);
            choiceButton3.setTextSize(25);
            choiceButton4.setTextSize(25);


            WordQuiz wordQuiz = exam.getWordQuizzes().pop();
            String question = wordQuiz.getQuestion();
            final String answer = wordQuiz.getAnswer();
            String pronunciation = wordQuiz.getPronunciation();
            ArrayList<String> choices = wordQuiz.getChoices();
            final String choice1 = choices.get(0);
            final String choice2 = choices.get(1);
            final String choice3 = choices.get(2);
            final String choice4 = choices.get(3);

            lifeTextView.setText(getString(R.string.life, life));
            questionTextView.setText(question);
            pronunciationTextView.setText(pronunciation);
            remainingTextView.setText(getString(R.string.remaining, getRemaining()));
            choiceButton1.setText(choice1);
            choiceButton2.setText(choice2);
            choiceButton3.setText(choice3);
            choiceButton4.setText(choice4);

            cl = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button_choice_1:
                            check(answer, choice1);
                            break;
                        case R.id.button_choice_2:
                            check(answer, choice2);
                            break;
                        case R.id.button_choice_3:
                            check(answer, choice3);
                            break;
                        case R.id.button_choice_4:
                            check(answer, choice4);
                            break;
                    }
                }
            };
            choiceButton1.setOnClickListener(cl);
            choiceButton2.setOnClickListener(cl);
            choiceButton3.setOnClickListener(cl);
            choiceButton4.setOnClickListener(cl);
        } else {
            setBlank();
        }
    }

    private void setBlank() {
        if (!exam.getBlankQuizzes().empty() && life > 0) {
            setContentView(R.layout.activity_blank);
            TextView lifeTextView = findViewById(R.id.text_life);
            TextView questionTextView = findViewById(R.id.blank_quiz);
            TextView pronunciationTextView = findViewById(R.id.blank_pronunciation);
            TextView meaningTextView = findViewById(R.id.blank_meaning);
            TextView remainingTextView = findViewById(R.id.tv_remaining);
            Button choiceButton1 = findViewById(R.id.button_choice_1);
            Button choiceButton2 = findViewById(R.id.button_choice_2);
            Button choiceButton3 = findViewById(R.id.button_choice_3);
            Button choiceButton4 = findViewById(R.id.button_choice_4);

            BlankQuiz blankQuiz = exam.getBlankQuizzes().pop();
            String question = blankQuiz.getQuestion();
            final String answer = blankQuiz.getAnswer();
            String pronunciation = blankQuiz.getPronunciation();
            String meaning = blankQuiz.getMeaning();
            ArrayList<String> choices = blankQuiz.getChoices();
            final String choice1 = choices.get(0);
            final String choice2 = choices.get(1);
            final String choice3 = choices.get(2);
            final String choice4 = choices.get(3);

            lifeTextView.setText(getString(R.string.life, life));
            questionTextView.setText(question);
            pronunciationTextView.setText(pronunciation);
            meaningTextView.setText(meaning);
            remainingTextView.setText(getString(R.string.remaining, getRemaining()));
            choiceButton1.setText(choice1);
            choiceButton2.setText(choice2);
            choiceButton3.setText(choice3);
            choiceButton4.setText(choice4);

            cl = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button_choice_1:
                            check(answer, choice1);
                            break;
                        case R.id.button_choice_2:
                            check(answer, choice2);
                            break;
                        case R.id.button_choice_3:
                            check(answer, choice3);
                            break;
                        case R.id.button_choice_4:
                            check(answer, choice4);
                            break;
                    }
                }
            };
            choiceButton1.setOnClickListener(cl);
            choiceButton2.setOnClickListener(cl);
            choiceButton3.setOnClickListener(cl);
            choiceButton4.setOnClickListener(cl);
        } else {
            setArrange();
        }
    }

    private void setArrange() {
        if (!exam.getArrangeDataStack().empty() && life > 0) {
            setContentView(R.layout.activity_arrange);
            final LinearLayout sentenceLinearLayout = findViewById(R.id.ll_sentence);
            TextView meaningTextView = findViewById(R.id.tv_meaning);
            final LinearLayout wordLinearLayout = findViewById(R.id.ll_word);
            TextView lifeTextView = findViewById(R.id.text_life);
            TextView remainingTextView = findViewById(R.id.tv_remaining);

            ArrangeData arrangeData = exam.getArrangeDataStack().pop();
            sentenceLinearLayout.removeAllViews();
            meaningTextView.setText(arrangeData.getMeaning());
            wordLinearLayout.removeAllViews();
            lifeTextView.setText(getString(R.string.life, life));
            remainingTextView.setText(getString(R.string.remaining, getRemaining()));

            final ArrayList<String> answer = new ArrayList<>(arrangeData.getChoices());
            final ArrayList<String> arrange = new ArrayList<>();
            ArrayList<String> choices = new ArrayList<>(answer);
            Collections.shuffle(choices);

            cl = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (arrange.size() != answer.size()) {
                        String choice = (String) v.getTag();
                        arrange.add(choice);
                        TextView textView = new TextView(getApplicationContext());
                        textView.setText(choice);
                        sentenceLinearLayout.addView(textView);
                        wordLinearLayout.removeView(v);
                    }
                    if (arrange.size() == answer.size()) {
                        if (arrange.equals(answer)) {
                            Toast.makeText(getApplicationContext(), "정답!", Toast.LENGTH_SHORT).show();
                            setMatching();
                        } else {
                            Toast.makeText(getApplicationContext(), "오답...", Toast.LENGTH_SHORT).show();
                            wrong();
                        }
                    }
                }
            };

            for (String choice : choices) {
                Button button = new Button(this);
                button.setText(choice);
                button.setTag(choice);
                button.setOnClickListener(cl);
                wordLinearLayout.addView(button);
            }
        } else {
            complete();
        }
    }

    private int getRemaining() {
        return exam.getWordQuizzes().size() + exam.getArrangeDataStack().size() + exam.getBlankQuizzes().size();
    }

    private void check(String answer, String choice) {
        if (answer.equals(choice)) {
            Toast.makeText(this, "정답!", Toast.LENGTH_SHORT).show();
            setMatching();
        } else {
            Toast.makeText(this, "오답...", Toast.LENGTH_SHORT).show();
            wrong();
        }
    }

    private void wrong() {
        if (life > 0) {
            life--;
        }
        if (life <= 0) {
            over();
        } else {
            setMatching();
        }
    }

    private void over() {
        Toast.makeText(this, "실패...", Toast.LENGTH_SHORT).show();
        finish();
    }

    private void complete() {
        Toast.makeText(this, "성공!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
