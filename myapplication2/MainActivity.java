package com.vishwak.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switchButton = findViewById(R.id.button);

        switchButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switch to the second activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }


        });
        imageView = findViewById(R.id.imageView4);

        // Trigger the infinite alpha animation when the activity starts
        startInfiniteAlphaAnimation();
    }

    private void startInfiniteAlphaAnimation() {
        // Create an alpha animation
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000); // Set the duration of each cycle (in milliseconds)

        // Set up properties for infinite animation
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        alphaAnimation.setRepeatCount(Animation.INFINITE);

        // Start the animation
        imageView.startAnimation(alphaAnimation);


    }
}