package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private Button clockwise;
   private Button anticlockwise;
   private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clockwise=(Button) findViewById(R.id.btnclockwise);
        anticlockwise=(Button) findViewById(R.id.btnanticlockwise);
        img=(ImageView) findViewById(R.id.imageView);

        clockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation aniRotateClk = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
                img.startAnimation(aniRotateClk);
            }
        });

        anticlockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animRotateAclk = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);
                img.startAnimation(animRotateAclk);
            }
        });
    }
}