package com.vishwak.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    ImageButton foodbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        foodbutton = findViewById(R.id.foodbutton);

        foodbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switch to the second activity
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }


        });
    }
}