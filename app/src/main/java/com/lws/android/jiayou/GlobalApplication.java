package com.lws.android.jiayou;

import android.app.Application;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;

import java.util.Locale;

public class GlobalApplication extends Application {
    private static GlobalApplication instance;
    private TextToSpeech tts;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = tts.setLanguage(Locale.CHINA);
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Toast.makeText(getApplicationContext(), "지원하지 않는 언어입니다", Toast.LENGTH_LONG).show();
                        Intent installIntent = new Intent();
                        installIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                        installIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(installIntent);
                    } else {
                        Toast.makeText(getApplicationContext(), "초기화 성공", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "초기화 실패", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public TextToSpeech getTts() {
        return tts;
    }

    public static GlobalApplication getInstance() {
        return instance;
    }

    @Override
    public void onTerminate() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
            tts = null;
        }
        super.onTerminate();
    }
}
