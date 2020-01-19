package com.lws.android.jiayou;

public class hskWord {
    private String character;
    private String pronunciation;
    private String meaning;

    public hskWord(String character, String meaning, String pronunciation) {
        this.character = character;
        this.meaning = meaning;
        this.pronunciation = pronunciation;
    }

    public String getCharacter() {
        return character;
    }
    public String getMeaning() {
        return meaning;
    }
    public String getPronunciation() {
        return pronunciation;
    }



}
