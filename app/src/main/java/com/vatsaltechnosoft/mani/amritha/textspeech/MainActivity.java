package com.vatsaltechnosoft.mani.amritha.textspeech;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button textSpeech, speechText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        initListener();
    }

    private void initViews() {

        textSpeech = findViewById(R.id.text_speech_button);

        speechText = findViewById(R.id.speech_text_button);

    }

    private void initListener() {

        textSpeech.setOnClickListener(this);

        speechText.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.text_speech_button:
                Intent intent = new Intent(MainActivity.this, TextToSpeechActivity.class);
                startActivity(intent);
                break;

            case R.id.speech_text_button:
                Intent i = new Intent(MainActivity.this, SpeechToTextActivity.class);
                startActivity(i);
                break;
        }
    }
}
