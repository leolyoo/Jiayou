package com.lws.android.jiayou;

import android.content.Intent;
import android.widget.ListView;
import android.widget.TextView;

public class hskWordActivity extends BaseActivity {

    @Override
    protected void init() {
        setContentView(R.layout.activity_hsk_word);

        TextView titleText = (TextView) findViewById(R.id.hsk_word_text);
        titleText.setText(hskActivity.hskTitle);

        ListView hskList = findViewById(R.id.list_hsk);

        hskList.setAdapter(new hskWordAdapter(this,DataLoader.loadHskWordData(hskActivity.hsk_Index)));



    }
}
