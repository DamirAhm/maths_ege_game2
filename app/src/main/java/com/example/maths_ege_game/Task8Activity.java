package com.example.maths_ege_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Task8Activity extends AppCompatActivity implements View.OnClickListener {

    private Button check1, check2, check3, check4, check5, check6, check7, check8, check9, check10;
    private Button check11, check12, check13, check14, check15, check16, check17, check18, check19, check20;
    private Button check21, check22, check23, check24, check25, check26, check27, check28, check29, check30;
    private EditText ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8;
    private EditText ans9, ans10, ans11, ans12, ans13, ans14, ans15, ans16;
    private EditText ans17, ans18, ans19, ans20, ans21, ans22, ans23, ans24;
    private EditText ans25, ans26, ans27, ans28, ans29, ans30;
    private TextView task1, task2, task3, task4, task5, task6, task7, task8, task9, task10;
    private TextView task11, task12, task13, task14, task15, task16, task17, task18, task19, task20;
    private TextView task21, task22, task23, task24, task25, task26, task27, task28, task29, task30;
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
    private String trueAns21;
    private String trueAns22;
    private String trueAns23;
    private String trueAns24;
    private String trueAns25;
    private String trueAns26;
    private String trueAns27;
    private String trueAns28;
    private String trueAns29;
    private String trueAns30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task8);

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
        check21=(Button)findViewById(R.id.btnCheck21);
        check22=(Button)findViewById(R.id.btnCheck22);
        check23=(Button)findViewById(R.id.btnCheck23);
        check24=(Button)findViewById(R.id.btnCheck24);
        check25=(Button)findViewById(R.id.btnCheck25);
        check26=(Button)findViewById(R.id.btnCheck26);
        check27=(Button)findViewById(R.id.btnCheck27);
        check28=(Button)findViewById(R.id.btnCheck28);
        check29=(Button)findViewById(R.id.btnCheck29);
        check30=(Button)findViewById(R.id.btnCheck30);

        ans1=(EditText)findViewById(R.id.ansTask8_1);
        ans2=(EditText)findViewById(R.id.ansTask8_2);
        ans3=(EditText)findViewById(R.id.ansTask8_3);
        ans4=(EditText)findViewById(R.id.ansTask8_4);
        ans5=(EditText)findViewById(R.id.ansTask8_5);
        ans6=(EditText)findViewById(R.id.ansTask8_6);
        ans7=(EditText)findViewById(R.id.ansTask8_7);
        ans8=(EditText)findViewById(R.id.ansTask8_8);
        ans9=(EditText)findViewById(R.id.ansTask8_9);
        ans10=(EditText)findViewById(R.id.ansTask8_10);
        ans11=(EditText)findViewById(R.id.ansTask8_11);
        ans12=(EditText)findViewById(R.id.ansTask8_12);
        ans13=(EditText)findViewById(R.id.ansTask8_13);
        ans14=(EditText)findViewById(R.id.ansTask8_14);
        ans15=(EditText)findViewById(R.id.ansTask8_15);
        ans16=(EditText)findViewById(R.id.ansTask8_16);
        ans17=(EditText)findViewById(R.id.ansTask8_17);
        ans18=(EditText)findViewById(R.id.ansTask8_18);
        ans19=(EditText)findViewById(R.id.ansTask8_19);
        ans20=(EditText)findViewById(R.id.ansTask8_20);
        ans21=(EditText)findViewById(R.id.ansTask8_21);
        ans22=(EditText)findViewById(R.id.ansTask8_22);
        ans23=(EditText)findViewById(R.id.ansTask8_23);
        ans24=(EditText)findViewById(R.id.ansTask8_24);
        ans25=(EditText)findViewById(R.id.ansTask8_25);
        ans26=(EditText)findViewById(R.id.ansTask8_26);
        ans27=(EditText)findViewById(R.id.ansTask8_27);
        ans28=(EditText)findViewById(R.id.ansTask8_28);
        ans29=(EditText)findViewById(R.id.ansTask8_29);
        ans30=(EditText)findViewById(R.id.ansTask8_30);

        task1=(TextView)findViewById(R.id.task8_1);
        task2=(TextView)findViewById(R.id.task8_2);
        task3=(TextView)findViewById(R.id.task8_3);
        task4=(TextView)findViewById(R.id.task8_4);
        task5=(TextView)findViewById(R.id.task8_5);
        task6=(TextView)findViewById(R.id.task8_6);
        task7=(TextView)findViewById(R.id.task8_7);
        task8=(TextView)findViewById(R.id.task8_8);
        task9=(TextView)findViewById(R.id.task8_9);
        task10=(TextView)findViewById(R.id.task8_10);
        task11=(TextView)findViewById(R.id.task8_11);
        task12=(TextView)findViewById(R.id.task8_12);
        task13=(TextView)findViewById(R.id.task8_13);
        task14=(TextView)findViewById(R.id.task8_14);
        task15=(TextView)findViewById(R.id.task8_15);
        task16=(TextView)findViewById(R.id.task8_16);
        task17=(TextView)findViewById(R.id.task8_17);
        task18=(TextView)findViewById(R.id.task8_18);
        task19=(TextView)findViewById(R.id.task8_19);
        task20=(TextView)findViewById(R.id.task8_20);
        task21=(TextView)findViewById(R.id.task8_21);
        task22=(TextView)findViewById(R.id.task8_22);
        task23=(TextView)findViewById(R.id.task8_23);
        task24=(TextView)findViewById(R.id.task8_24);
        task25=(TextView)findViewById(R.id.task8_25);
        task26=(TextView)findViewById(R.id.task8_26);
        task27=(TextView)findViewById(R.id.task8_27);
        task28=(TextView)findViewById(R.id.task8_28);
        task29=(TextView)findViewById(R.id.task8_29);
        task30=(TextView)findViewById(R.id.task8_30);

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
        check21.setOnClickListener(this);
        check22.setOnClickListener(this);
        check23.setOnClickListener(this);
        check24.setOnClickListener(this);
        check25.setOnClickListener(this);
        check26.setOnClickListener(this);
        check27.setOnClickListener(this);
        check28.setOnClickListener(this);
        check29.setOnClickListener(this);
        check30.setOnClickListener(this);

        trueAns1=getString(R.string.answerTask8_1);
        trueAns2=getString(R.string.answerTask8_2);
        trueAns3=getString(R.string.answerTask8_3);
        trueAns4=getString(R.string.answerTask8_4);
        trueAns5=getString(R.string.answerTask8_5);
        trueAns6=getString(R.string.answerTask8_6);
        trueAns7=getString(R.string.answerTask8_7);
        trueAns8=getString(R.string.answerTask8_8);
        trueAns9=getString(R.string.answerTask8_9);
        trueAns10=getString(R.string.answerTask8_10);
        trueAns11=getString(R.string.answerTask8_11);
        trueAns12=getString(R.string.answerTask8_12);
        trueAns13=getString(R.string.answerTask8_13);
        trueAns14=getString(R.string.answerTask8_14);
        trueAns15=getString(R.string.answerTask8_15);
        trueAns16=getString(R.string.answerTask8_16);
        trueAns17=getString(R.string.answerTask8_17);
        trueAns18=getString(R.string.answerTask8_18);
        trueAns19=getString(R.string.answerTask8_19);
        trueAns20=getString(R.string.answerTask8_20);
        trueAns21=getString(R.string.answerTask8_21);
        trueAns22=getString(R.string.answerTask8_22);
        trueAns23=getString(R.string.answerTask8_23);
        trueAns24=getString(R.string.answerTask8_24);
        trueAns25=getString(R.string.answerTask8_25);
        trueAns26=getString(R.string.answerTask8_26);
        trueAns27=getString(R.string.answerTask8_27);
        trueAns28=getString(R.string.answerTask8_28);
        trueAns29=getString(R.string.answerTask8_29);
        trueAns30=getString(R.string.answerTask8_30);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCheck1:
                if (ans1.getText().toString().equals(trueAns1)) {
                    task1.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task1.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck2:
                if (ans2.getText().toString().equals(trueAns2)) {
                    task2.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task2.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck3:
                if (ans3.getText().toString().equals(trueAns3)) {
                    task3.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task3.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck4:
                if (ans4.getText().toString().equals(trueAns4)) {
                    task4.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task4.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck5:
                if (ans5.getText().toString().equals(trueAns5)) {
                    task5.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task5.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck6:
                if (ans6.getText().toString().equals(trueAns6)) {
                    task6.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task6.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck7:
                if (ans7.getText().toString().equals(trueAns7)) {
                    task7.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task7.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck8:
                if (ans8.getText().toString().equals(trueAns8)) {
                    task8.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task8.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck9:
                if (ans9.getText().toString().equals(trueAns9)) {
                    task9.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task9.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck10:
                if (ans10.getText().toString().equals(trueAns10)) {
                    task10.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task10.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck11:
                if (ans11.getText().toString().equals(trueAns11)) {
                    task11.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task11.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck12:
                if (ans12.getText().toString().equals(trueAns12)) {
                    task12.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task12.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck13:
                if (ans13.getText().toString().equals(trueAns13)) {
                    task13.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task13.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck14:
                if (ans14.getText().toString().equals(trueAns14)) {
                    task14.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task14.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck15:
                if (ans15.getText().toString().equals(trueAns15)) {
                    task15.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task15.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck16:
                if (ans16.getText().toString().equals(trueAns16)) {
                    task16.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task16.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck17:
                if (ans17.getText().toString().equals(trueAns17)) {
                    task17.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task17.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck18:
                if (ans18.getText().toString().equals(trueAns18)) {
                    task18.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task18.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck19:
                if (ans19.getText().toString().equals(trueAns19)) {
                    task19.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task19.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck20:
                if (ans20.getText().toString().equals(trueAns20)) {
                    task20.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task20.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck21:
                if (ans21.getText().toString().equals(trueAns21)) {
                    task21.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task21.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck22:
                if (ans22.getText().toString().equals(trueAns22)) {
                    task22.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task22.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck23:
                if (ans23.getText().toString().equals(trueAns23)) {
                    task23.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task23.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck24:
                if (ans24.getText().toString().equals(trueAns24)) {
                    task24.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task24.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck25:
                if (ans25.getText().toString().equals(trueAns25)) {
                    task25.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task25.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck26:
                if (ans26.getText().toString().equals(trueAns26)) {
                    task26.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task26.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck27:
                if (ans27.getText().toString().equals(trueAns27)) {
                    task27.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task27.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck28:
                if (ans28.getText().toString().equals(trueAns28)) {
                    task28.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task28.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck29:
                if (ans29.getText().toString().equals(trueAns29)) {
                    task29.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task29.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnCheck30:
                if (ans30.getText().toString().equals(trueAns30)) {
                    task30.setTextColor(getResources().getColor(R.color.colorGreen));
                    Toast.makeText(Task8Activity.this, "true", Toast.LENGTH_LONG).show();
                } else {
                    task30.setTextColor(getResources().getColor(R.color.colorRed));
                    Toast.makeText(Task8Activity.this, "wrong", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
