package com.example.dz1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MotionLayout an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView m = (ImageView) findViewById(R.id.imageView2);
        an = findViewById(R.id.motion);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                an.transitionToEnd();

            }
        });
    }
}