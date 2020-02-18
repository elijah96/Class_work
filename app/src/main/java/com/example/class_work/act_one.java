package com.example.class_work;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class act_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_one);
        Button but =(Button)findViewById(R.id.btnplay);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer=MediaPlayer.create(act_one.this,R.raw.tango);
                mediaPlayer.start();

            }
        });
    }

}
