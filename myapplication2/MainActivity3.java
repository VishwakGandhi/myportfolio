package com.vishwak.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button vada;
    Button misalpav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        vada = findViewById(R.id.vada);

        vada.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switch to the second activity
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }


        });
        misalpav = findViewById(R.id.misalpav);

        misalpav.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switch to the second activity
                Intent intent = new Intent(MainActivity3.this, misalpav.class);
                startActivity(intent);
            }


        });
    }
}