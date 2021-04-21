package com.example.hw3_2_1223223;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import static androidx.annotation.Dimension.DP;

public class MainActivity extends AppCompatActivity {
    FrameLayout mainView;
    LinearLayout blueView;
    LinearLayout yellowView;
    LinearLayout blackView;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        setContentView(R.layout.activity_main);
        mainView = (FrameLayout) findViewById(R.id.out_view);
        blueView = (LinearLayout) findViewById(R.id.blue_view);
        yellowView = (LinearLayout) findViewById(R.id.yellow_view);
        blackView = (LinearLayout) findViewById(R.id.black_view);

        blueView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewWidth = blueView.getWidth();
                int viewHeight = blueView.getHeight();
                showLayout(viewWidth, viewHeight);
            }
        });
        yellowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewWidth = yellowView.getWidth();
                int viewHeight = yellowView.getHeight();
                showLayout(viewWidth, viewHeight);
            }
        });
        blackView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewWidth = blackView.getWidth();
                int viewHeight = blackView.getHeight();
                showLayout(viewWidth, viewHeight);
            }
        });
    }

        public void showLayout(int width, int height) {
            Toast.makeText(getApplicationContext(), String.format("너비 : %d, 높이 : %d", width, height), Toast.LENGTH_SHORT).show();
        }
    }
