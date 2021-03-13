package com.example.maths_ege_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TaskActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonTask1;
    private Button buttonTask2;
    private Button buttonTask3;
    private Button buttonTask4;
    private Button buttonTask5;
    private Button buttonTask6;
    private Button buttonTask7;
    private Button buttonTask8;
    private Button buttonTask9;
    private Button buttonTask10;
    private Button buttonTask11;
    private Button buttonTask12;
    private Button buttonTask13;
    private Button buttonTask14;
    private Button buttonTask15;
    private Button buttonTask16;
    private Button buttonTask17;
    private Button buttonTask18;
    private Button buttonTask19;
    private MediaPlayer buttonSound1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        buttonTask1 = (Button)findViewById(R.id.button);
        buttonTask2 = (Button)findViewById(R.id.button2);
        buttonTask3 = (Button)findViewById(R.id.button3);
        buttonTask4 = (Button)findViewById(R.id.button4);
        buttonTask5 = (Button)findViewById(R.id.button5);
        buttonTask6 = (Button)findViewById(R.id.button6);
        buttonTask7 = (Button)findViewById(R.id.button7);
        buttonTask8 = (Button)findViewById(R.id.button8);
        buttonTask9 = (Button)findViewById(R.id.button9);
        buttonTask10 = (Button)findViewById(R.id.button10);
        buttonTask11 = (Button)findViewById(R.id.button11);
        buttonTask12 = (Button)findViewById(R.id.button12);
        buttonTask13 = (Button)findViewById(R.id.button13);
        buttonTask14 = (Button)findViewById(R.id.button14);
        buttonTask15 = (Button)findViewById(R.id.button15);
        buttonTask16 = (Button)findViewById(R.id.button16);
        buttonTask17 = (Button)findViewById(R.id.button17);
        buttonTask18 = (Button)findViewById(R.id.button18);
        buttonTask19 = (Button)findViewById(R.id.button19);
        buttonSound1 = MediaPlayer.create(this,R.raw.button_sound);
        buttonTask1.setOnClickListener(this);
        buttonTask2.setOnClickListener(this);
        buttonTask3.setOnClickListener(this);
        buttonTask4.setOnClickListener(this);
        buttonTask5.setOnClickListener(this);
        buttonTask6.setOnClickListener(this);
        buttonTask7.setOnClickListener(this);
        buttonTask8.setOnClickListener(this);
        buttonTask9.setOnClickListener(this);
        buttonTask10.setOnClickListener(this);
        buttonTask11.setOnClickListener(this);
        buttonTask12.setOnClickListener(this);
        buttonTask13.setOnClickListener(this);
        buttonTask14.setOnClickListener(this);
        buttonTask15.setOnClickListener(this);
        buttonTask16.setOnClickListener(this);
        buttonTask17.setOnClickListener(this);
        buttonTask18.setOnClickListener(this);
        buttonTask19.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.button:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task1Activity.class);
                startActivity(i);
                break;
            case R.id.button2:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task2Activity.class);
                startActivity(i);
                break;
            case R.id.button3:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task3Activity.class);
                startActivity(i);
                break;
            case R.id.button4:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task4Activity.class);
                startActivity(i);
                break;
            case R.id.button5:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task5Activity.class);
                startActivity(i);
                break;
            case R.id.button6:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task6Activity.class);
                startActivity(i);
                break;
            case R.id.button7:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task7Activity.class);
                startActivity(i);
                break;
            case R.id.button8:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task8Activity.class);
                startActivity(i);
                break;
            case R.id.button9:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task9Activity.class);
                startActivity(i);
                break;
            case R.id.button10:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task10Activity.class);
                startActivity(i);
                break;
            case R.id.button11:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task11Activity.class);
                startActivity(i);
                break;
            case R.id.button12:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task12Activity.class);
                startActivity(i);
                break;
            case R.id.button13:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task13Activity.class);
                startActivity(i);
                break;
            case R.id.button14:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task14Activity.class);
                startActivity(i);
                break;
            case R.id.button15:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task15Activity.class);
                startActivity(i);
                break;
            case R.id.button16:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task16Activity.class);
                startActivity(i);
                break;
            case R.id.button17:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task17Activity.class);
                startActivity(i);
                break;
            case R.id.button18:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task18Activity.class);
                startActivity(i);
                break;
            case R.id.button19:
                MainActivity.soundPlay(buttonSound1);
                i = new Intent(this,Task19Activity.class);
                startActivity(i);
                break;
        }
    }

}
