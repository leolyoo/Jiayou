package com.lws.android.jiayou;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Exam {
    private Stack<WordQuiz> wordQuizzes;
    private Stack<BlankQuiz> blankQuizzes;
    private Stack<ArrangeData> arrangeDataStack;

    public Exam(Context context, String stage) {
        ArrayList<Word> words = DataLoader.loadWords(stage, context.getString(R.string.part_1));
        words.addAll(DataLoader.loadWords(stage, context.getString(R.string.part_2)));

        wordQuizzes = new WordQuizGenerator(words).generate();

        ArrayList<Blank> blanks = DataLoader.loadBlanks(stage, context.getString(R.string.part_1));
        blanks.addAll(DataLoader.loadBlanks(stage, context.getString(R.string.part_2)));

        blankQuizzes = new Stack<>();

        Stack<Blank> blankStack = new Stack<>();
        for (Blank blank : blanks) {
            blankStack.push(blank);
        }
        Collections.shuffle(blankStack);

        while (!blankStack.empty()) {
            Blank pop = blankStack.pop();
            String question = pop.getCharacter();
            String answer = pop.getBlank_Answer();
            String pronunciation = pop.getPronunciation();
            String meaning = pop.getMeaning();
            ArrayList<String> choices = new ArrayList<>();

            for (Blank blank : blanks) {
                String choice = blank.getBlank_Answer();
                if (!choice.equals(answer))
                choices.add(choice);
            }
            Collections.shuffle(choices);
            while (choices.size() > 3) {
                choices.remove(0);
            }
            choices.add(answer);
            Collections.shuffle(choices);
            blankQuizzes.push(new BlankQuiz(question, pronunciation, meaning, answer, choices));
        }
        Collections.shuffle(blankQuizzes);

        ArrayList<ArrangeData> arrangeDataArrayList = DataLoader.loadArrangeData(stage, context.getString(R.string.part_1));
        arrangeDataArrayList.addAll(DataLoader.loadArrangeData(stage, context.getString(R.string.part_2)));
        arrangeDataStack = new Stack<>();
        for (ArrangeData arrangeData : arrangeDataArrayList) {
            arrangeDataStack.push(arrangeData);
        }
        Collections.shuffle(arrangeDataStack);

        while (blankQuizzes.size() + arrangeDataStack.size() > 10) {
            blankQuizzes.pop();
        }
    }

    public Stack<WordQuiz> getWordQuizzes() {
        return wordQuizzes;
    }

    public Stack<BlankQuiz> getBlankQuizzes() {
        return blankQuizzes;
    }

    public Stack<ArrangeData> getArrangeDataStack() {
        return arrangeDataStack;
    }
}
