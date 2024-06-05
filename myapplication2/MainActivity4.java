package com.vishwak.myapplication2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;

public class MainActivity4 extends AppCompatActivity {

    Button vplisten;
    TextView vp;
    TextToSpeech.OnInitListener inListener;
    TextToSpeech tts;
    int speechQueue = TextToSpeech.QUEUE_FLUSH; // QUEUE_FLUSH to stop and start from the beginning

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        vp = findViewById(R.id.vp);
        vplisten = findViewById(R.id.vplisten);

        vplisten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = vp.getText().toString();
                tts.speak(data, speechQueue, new HashMap<>());
            }
        });

        inListener = new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                // Initialization code here if needed
            }
        };

        tts = new TextToSpeech(MainActivity4.this, inListener);
    }

    @Override
    public void onBackPressed() {
        // Stop the Text-to-Speech when back key is pressed
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        // Release the TextToSpeech engine when the activity is destroyed
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // Pause TTS when the activity is paused
        if (tts != null && tts.isSpeaking()) {
            tts.stop();
        }
        super.onPause();
    }

    @Override
    protected void onResume() {
        // No need to resume explicitly
        super.onResume();
    }
}
