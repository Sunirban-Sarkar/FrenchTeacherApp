package com.sunirban.frenchteacherapp;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayTheColor(View view) {
        Button clicked_btn = (Button) view;

        @SuppressLint("DiscouragedApi") MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(clicked_btn.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();
    }
}