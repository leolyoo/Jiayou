package com.lws.android.jiayou;

import java.util.List;

public class ArrangeData {
    private String meaning;
    private List<String> choices;

    public ArrangeData(String meaning, List<String> choices) {
        this.meaning = meaning;
        this.choices = choices;
    }

    public String getMeaning() {
        return meaning;
    }

    public List<String> getChoices() {
        return choices;
    }
}
