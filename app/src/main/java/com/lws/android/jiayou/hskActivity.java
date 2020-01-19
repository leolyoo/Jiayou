package com.lws.android.jiayou;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class hskActivity extends BaseActivity {
    static int hsk_Index = 0;
    static String hskTitle = null;
    ArrayList<Button> hskButtons = new ArrayList<>();

    @Override
    protected void init() {
        setContentView(R.layout.activity_hsk);

        hskButtons.add((Button) findViewById(R.id.hsk_first));
        hskButtons.add((Button) findViewById(R.id.hsk_second));
        hskButtons.add((Button) findViewById(R.id.hsk_third));
        hskButtons.add((Button) findViewById(R.id.hsk_fourth));
        hskButtons.add((Button) findViewById(R.id.hsk_fifth));
        hskButtons.add((Button) findViewById(R.id.hsk_sixth));
        initializeButtons();

    }

    public void onClick(View v) {
        initializeButtons(); // 모든 버튼 초기화.

        Intent intent = new Intent(getApplicationContext(), hskWordActivity.class);
        switch (v.getId()) {
            case R.id.hsk_first:
                hsk_Index = 1;
                hskTitle = "HSK 단어 1 ~ 100";
                break;
            case R.id.hsk_second:
                hsk_Index = 2;
                hskTitle = "HSK 단어 101 ~ 200";
                break;
            case R.id.hsk_third:
                hsk_Index = 3;
                hskTitle = "HSK 단어 201 ~ 300";
                break;
            case R.id.hsk_fourth:
                hsk_Index = 4;
                hskTitle = "HSK 단어 301 ~ 400";
                break;
            case R.id.hsk_fifth:
                hsk_Index = 5;
                hskTitle = "HSK 단어 401 ~ 500";
                break;
            case R.id.hsk_sixth:
                hsk_Index = 6;
                hskTitle = "HSK 단어 501 ~ 600";
                break;
        }
        activateButton(); // 버튼 활성화.
        startActivity(intent);
    }

    private void activateButton() {
        hskButtons.get(hsk_Index - 1).setBackgroundResource(R.drawable.airplane);
        hskButtons.get(hsk_Index - 1).setTextColor(Color.argb(0, 0, 0, 0));
    }

    private void initializeButtons() {
        for (Button button : hskButtons) {
            button.setBackgroundResource(R.drawable.cloud);
            button.setTextColor(Color.BLACK);
        }
    }
}
