package com.lws.android.jiayou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class WordQuizGenerator {

    ArrayList<Word> words;

    public WordQuizGenerator(ArrayList<Word> words) {
        this.words = words;
    }

    public Stack<WordQuiz> generate() {
        Stack<WordQuiz> wordQuizzes = new Stack<>();

        for (Word word : words) {
            wordQuizzes.push(generateCharacterQuiz(word));
        }
        for (Word word : words) {
            wordQuizzes.push(generateMeaningQuiz(word));
        }
        Collections.shuffle(wordQuizzes);

        while (wordQuizzes.size() > 10) {
            wordQuizzes.pop();
        }

        return wordQuizzes;
    }

    private WordQuiz generateCharacterQuiz(Word word) {
        Stack<Word> stack = new Stack<>();
        for (Word w : words) {
            stack.push(w);
        }
        Collections.shuffle(stack);

        String question = word.getCharacter();
        String answer = word.getMeaning();
        String pronunciation = word.getPronunciation();

        HashSet<String> set = new HashSet<>();
        set.add(answer);
        while (set.size() < 4) {
            set.add(stack.pop().getMeaning());
        }
        ArrayList<String> choices = new ArrayList<>(set);
        Collections.shuffle(choices);

        return new WordQuiz(question, answer, pronunciation, choices);
    }

    private WordQuiz generateMeaningQuiz(Word word) {
        Stack<Word> stack = new Stack<>();
        for (Word w : words) {
            stack.push(w);
        }
        Collections.shuffle(stack);

        String question = word.getMeaning();
        String answer = word.getCharacter();
        String pronunciation = "";

        HashMap<String, String> map = new HashMap<>();
        map.put(question, answer);
        while (map.size() < 4) {
            Word pop = stack.pop();
            map.put(pop.getMeaning(), pop.getCharacter());
        }
        if (!map.containsValue(answer)) {
            map.put(question, answer);
        }
        ArrayList<String> choices = new ArrayList<>(map.values());
        Collections.shuffle(choices);

        return new WordQuiz(question, answer, pronunciation, choices);
    }
}