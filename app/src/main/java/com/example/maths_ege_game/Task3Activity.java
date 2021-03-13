package com.example.maths_ege_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Task3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button check1, check2, check3, check4, check5, check6, check7, check8, check9, check10;
    private Button check11, check12, check13, check14, check15, check16, check17, check18, check19, check20;
    private EditText ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10;
    private EditText ans11, ans12, ans13, ans14, ans15, ans16, ans17, ans18, ans19, ans20;
    private TextView task1, task2, task3, task4, task5, task6, task7, task8, task9, task10;
    private TextView task11, task12, task13, task14, task15, task16, task17, task18, task19, task20;
    private String trueAns1;
    private String trueAns2;
    private String trueAns3;
    private String trueAns4;
    private String trueAns5;
    private String trueAns6;
    private String trueAns7;
    private String trueAns8;
    private String trueAns9;
    private String trueAns10;
    private String trueAns11;
    private String trueAns12;
    private String trueAns13;
    private String trueAns14;
    private String trueAns15;
    private String trueAns16;
    private String trueAns17;
    private String trueAns18;
    private String trueAns19;
    private String trueAns20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        check1=(Button)findViewById(R.id.btnCheck1);
        check2=(Button)findViewById(R.id.btnCheck2);
        check3=(Button)findViewById(R.id.btnCheck3);
        check4=(Button)findViewById(R.id.btnCheck4);
        check5=(Button)findViewById(R.id.btnCheck5);
        check6=(Button)findViewById(R.id.btnCheck6);
        check7=(Button)findViewById(R.id.btnCheck7);
        check8=(Button)findViewById(R.id.btnCheck8);
        check9=(Button)findViewById(R.id.btnCheck9);
        check10=(Button)findViewById(R.id.btnCheck10);
        check11=(Button)findViewById(R.id.btnCheck11);
        check12=(Button)findViewById(R.id.btnCheck12);
        check13=(Button)findViewById(R.id.btnCheck13);
        check14=(Button)findViewById(R.id.btnCheck14);
        check15=(Button)findViewById(R.id.btnCheck15);
        check16=(Button)findViewById(R.id.btnCheck16);
        check17=(Button)findViewById(R.id.btnCheck17);
        check18=(Button)findViewById(R.id.btnCheck18);
        check19=(Button)findViewById(R.id.btnCheck19);
        check20=(Button)findViewById(R.id.btnCheck20);

        ans1=(EditText)findViewById(R.id.ansTask3_1);
        ans2=(EditText)findViewById(R.id.ansTask3_2);
        ans3=(EditText)findViewById(R.id.ansTask3_3);
        ans4=(EditText)findViewById(R.id.ansTask3_4);
        ans5=(EditText)findViewById(R.id.ansTask3_5);
        ans6=(EditText)findViewById(R.id.ansTask3_6);
        ans7=(EditText)findViewById(R.id.ansTask3_7);
        ans8=(EditText)findViewById(R.id.ansTask3_8);
        ans9=(EditText)findViewById(R.id.ansTask3_9);
        ans10=(EditText)findViewById(R.id.ansTask3_10);
        ans11=(EditText)findViewById(R.id.ansTask3_11);
        ans12=(EditText)findViewById(R.id.ansTask3_12);
        ans13=(EditText)findViewById(R.id.ansTask3_13);
        ans14=(EditText)findViewById(R.id.ansTask3_14);
        ans15=(EditText)findViewById(R.id.ansTask3_15);
        ans16=(EditText)findViewById(R.id.ansTask3_16);
        ans17=(EditText)findViewById(R.id.ansTask3_17);
        ans18=(EditText)findViewById(R.id.ansTask3_18);
        ans19=(EditText)findViewById(R.id.ansTask3_19);
        ans20=(EditText)findViewById(R.id.ansTask3_20);

        task1=(TextView)findViewById(R.id.task3_1);
        task2=(TextView)findViewById(R.id.task3_2);
        task3=(TextView)findViewById(R.id.task3_3);
        task4=(TextView)findViewById(R.id.task3_4);
        task5=(TextView)findViewById(R.id.task3_5);
        task6=(TextView)findViewById(R.id.task3_6);
        task7=(TextView)findViewById(R.id.task3_7);
        task8=(TextView)findViewById(R.id.task3_8);
        task9=(TextView)findViewById(R.id.task3_9);
        task10=(TextView)findViewById(R.id.task3_10);
        task11=(TextView)findViewById(R.id.task3_11);
        task12=(TextView)findViewById(R.id.task3_12);
        task13=(TextView)findViewById(R.id.task3_13);
        task14=(TextView)findViewById(R.id.task3_14);
        task15=(TextView)findViewById(R.id.task3_15);
        task16=(TextView)findViewById(R.id.task3_16);
        task17=(TextView)findViewById(R.id.task3_17);
        task18=(TextView)findViewById(R.id.task3_18);
        task19=(TextView)findViewById(R.id.task3_19);
        task20=(TextView)findViewById(R.id.task3_20);

        check1.setOnClickListener(this);
        check2.setOnClickListener(this);
        check3.setOnClickListener(this);
        check4.setOnClickListener(this);
        check5.setOnClickListener(this);
        check6.setOnClickListener(this);
        check7.setOnClickListener(this);
        check8.setOnClickListener(this);
        check9.setOnClickListener(this);
        check10.setOnClickListener(this);
        check11.setOnClickListener(this);
        check12.setOnClickListener(this);
        check13.setOnClickListener(this);
        check14.setOnClickListener(this);
        check15.setOnClickListener(this);
        check16.setOnClickListener(this);
        check17.setOnClickListener(this);
        check18.setOnClickListener(this);
        check19.setOnClickListener(this);
        check20.setOnClickListener(this);

        trueAns1=getString(R.string.answerTask3_1);
        trueAns2=getString(R.string.answerTask3_2);
        trueAns3=getString(R.string.answerTask3_3);
        trueAns4=getString(R.string.answerTask3_4);
        trueAns5=getString(R.string.answerTask3_5);
        trueAns6=getString(R.string.answerTask3_6);
        trueAns7=getString(R.string.answerTask3_7);
        trueAns8=getString(R.string.answerTask3_8);
        trueAns9=getString(R.string.answerTask3_9);
        trueAns10=getString(R.string.answerTask3_10);
        trueAns11=getString(R.string.answerTask3_11);
        trueAns12=getString(R.string.answerTask3_12);
        trueAns13=getString(R.string.answerTask3_13);
        trueAns14=getString(R.string.answerTask3_14);
        trueAns15=getString(R.string.answerTask3_15);
        trueAns16=getString(R.string.answerTask3_16);
        trueAns17=getString(R.string.answerTask3_17);
        trueAns18=getString(R.string.answerTask3_18);
        trueAns19=getString(R.string.answerTask3_19);
        trueAns20=getString(R.string.answerTask3_20);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCheck1:
                if (ans1.getText().toString().equals(trueAns1)) {
                    task1.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task1.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck2:
                if (ans2.getText().toString().equals(trueAns2)) {
                    task2.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task2.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck3:
                if (ans3.getText().toString().equals(trueAns3)) {
                    task3.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task3.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck4:
                if (ans4.getText().toString().equals(trueAns4)) {
                    task4.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task4.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck5:
                if (ans5.getText().toString().equals(trueAns5)) {
                    task5.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task5.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck6:
                if (ans6.getText().toString().equals(trueAns6)) {
                    task6.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task6.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck7:
                if (ans7.getText().toString().equals(trueAns7)) {
                    task7.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task7.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck8:
                if (ans8.getText().toString().equals(trueAns8)) {
                    task8.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task8.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck9:
                if (ans9.getText().toString().equals(trueAns9)) {
                    task9.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task9.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck10:
                if (ans10.getText().toString().equals(trueAns10)) {
                    task10.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task10.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck11:
                if (ans11.getText().toString().equals(trueAns11)) {
                    task11.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task11.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck12:
                if (ans12.getText().toString().equals(trueAns12)) {
                    task12.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task12.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck13:
                if (ans13.getText().toString().equals(trueAns13)) {
                    task13.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task13.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck14:
                if (ans14.getText().toString().equals(trueAns14)) {
                    task14.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task14.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck15:
                if (ans15.getText().toString().equals(trueAns15)) {
                    task15.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task15.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck16:
                if (ans16.getText().toString().equals(trueAns16)) {
                    task16.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task16.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck17:
                if (ans17.getText().toString().equals(trueAns17)) {
                    task17.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task17.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck18:
                if (ans18.getText().toString().equals(trueAns18)) {
                    task18.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task18.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck19:
                if (ans19.getText().toString().equals(trueAns19)) {
                    task19.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task19.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck20:
                if (ans20.getText().toString().equals(trueAns20)) {
                    task20.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task3Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task20.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task3Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
