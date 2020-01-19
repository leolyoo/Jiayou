package com.lws.android.jiayou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class WriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);



        int image = getIntent().getIntExtra(Constants.EXTRA_WORD,0);

        LinearLayout drawLayout = (LinearLayout) findViewById(R.id.draw_layout);
        final MyView m = new MyView(this);
        drawLayout.addView(m);

       ImageView wordgif = (ImageView) findViewById(R.id.word_gif);

        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(wordgif);
        Glide.with(this).load(image).into(gifImage);

        Button clear_Drawlayout = (Button) findViewById(R.id.clear_btn);
        clear_Drawlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m.points.clear();
                m.invalidate();
            }
        });

    }
}
