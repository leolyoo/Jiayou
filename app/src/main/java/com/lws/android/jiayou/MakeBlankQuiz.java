package com.lws.android.jiayou;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Collectors;

public class MakeBlankQuiz extends AppCompatActivity {

    HashSet<BlankQuiz> blanksQuizzes;
    String stage, part;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_makeblankquiz);

        Intent intent = getIntent();
        stage = intent.getStringExtra(Constants.EXTRA_STAGE);
        part = intent.getStringExtra(Constants.EXTRA_PART);

        new Thread(new Runnable() {
            @Override
            public void run() {
                HashSet<Blank> blanks = new HashSet<>(DataLoader.loadBlanks(stage, part));

                blanksQuizzes = generateBlankQuizzes(blanks);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MakeBlankQuiz.this, BlankActivity.class);
                        intent.putExtra("blanksQuizzes", blanksQuizzes);
                        intent.putExtra(Constants.EXTRA_STAGE, stage);
                        intent.putExtra(Constants.EXTRA_PART, part);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        }).start();

    }

    private HashSet<BlankQuiz> generateBlankQuizzes(HashSet<Blank> blanks) {
        HashSet<BlankQuiz> blankQuizzes = new HashSet<>();
//        ArrayList<Blank> a = new ArrayList<>(blanks);
        Stack<Blank> blankStack = new Stack<>();
        for (Blank blank : blanks) {
            blankStack.push(blank);
        }
        Collections.shuffle(blankStack);
//        Random random = new Random();
        Blank question;
        HashMap<String, Blank> m = new HashMap<>();

        while (!blankStack.empty()) {
            if (blankQuizzes.size() < 8) {
                Stack<Blank> stack = new Stack<>();
                for (Blank blank : blanks) {
                    stack.push(blank);
                }
                Collections.shuffle(stack);
//            question = a.get(random.nextInt(a.size()));
                question = blankStack.pop();
                m.clear();
                m.put(question.getMeaning(), question);
//            while (m.size() < 4) {
                while (!stack.empty()) {
//                Blank b = a.get(random.nextInt(a.size()));
                    Blank b = stack.pop();
                    if (m.size() < 4) {
                        m.put(b.getMeaning(), b);
                    }
                }
                m.put(question.getMeaning(), question);

                ArrayList<Blank> choicesBlank = new ArrayList<>(m.values());

                Collections.shuffle(choicesBlank);

                ArrayList<String> choices = new ArrayList<>();
                ArrayList<String> choices2 = new ArrayList<>(); // 중복체크

                for (Blank blank : choicesBlank) {
                    choices.add(blank.getBlank_Answer());
                }

                if (choices.size() < 4) {
                    ArrayList<Word> words = new ArrayList<>(DataLoader.loadWords(stage, part));


                    Collections.shuffle(words);
                    for (Word word : words) {
                        choices.add(word.getCharacter());
                        for (int i =0; i < choices.size(); i ++ ){
                            if (!choices2.contains(choices.get(i))){
                                choices2.add(choices.get(i));
                            }
                        }
                    }
                }

                blankQuizzes.add(new BlankQuiz(question.getCharacter(), question.getMeaning(), question.getPronunciation(), question.getBlank_Answer(), choices2));

            }
        }
        return blankQuizzes;
    }


}
