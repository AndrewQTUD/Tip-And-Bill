package com.example.tipandbillapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDivide;
    Button btnTip;
    Button play;
    Button stop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTip = (Button) findViewById(R.id.button2);
        btnDivide = (Button) findViewById(R.id.button);
        play = (Button) findViewById(R.id.song);
        stop = (Button)findViewById(R.id.stop);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();

            }
        });



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });


        btnTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Tip.class);
                startActivity(myIntent);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, divide.class);
                startActivity(intent);
            }
        });


    }
}