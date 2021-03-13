package com.example.maths_ege_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonEge, buttonPart1, buttonTasks, buttonExit;
    private MediaPlayer buttonSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonEge = (Button)findViewById(R.id.buttonEge);
        buttonPart1 = (Button)findViewById(R.id.buttonPart1);
        buttonTasks = (Button)findViewById(R.id.buttonTasks);
        buttonExit = (Button)findViewById(R.id.buttonExit);
        buttonSound = MediaPlayer.create(this,R.raw.button_sound);
        buttonEge.setOnClickListener(this);
        buttonPart1.setOnClickListener(this);
        buttonTasks.setOnClickListener(this);
        buttonExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.buttonEge:
                soundPlay(buttonSound);
                i = new Intent(this,EgeActivity.class);
                startActivity(i);
                break;
            case R.id.buttonPart1:
                soundPlay(buttonSound);
                i = new Intent(this,Part1Activity.class);
                startActivity(i);
                break;
            case R.id.buttonTasks:
                soundPlay(buttonSound);
                i = new Intent(this,TaskActivity.class);
                startActivity(i);
                break;
            case R.id.buttonExit:
                soundPlay(buttonSound);
                onPause();
                onStop();
                finish();
                break;
        }
    }

    public static void soundPlay(MediaPlayer sound){
        sound.start();
    }
}

