package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button change = (Button) findViewById(R.id.button);

        final ImageView image = (ImageView) findViewById(R.id.image);

        final int[] changeImage = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Random randomImage = new Random();
                int img = randomImage.nextInt(4);

                image.setImageResource(changeImage[img]);
            }
        });
    }
}
