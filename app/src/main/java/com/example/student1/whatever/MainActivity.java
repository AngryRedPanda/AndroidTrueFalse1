package com.example.student1.whatever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TrueFalse tf = new TrueFalse("Вопрос", false);
    int questionCnt;
    TrueFalse Questions[] = {
            new TrueFalse("Are you noob at Android?", true),
            new TrueFalse("Do you like Android?", true),
            new TrueFalse("Will you become good at Android?", false),
    };
// fdfs
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button);
        Button prevBtn = (Button) findViewById(R.id.button2);
        Button nextBtn = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Заголовок", Questions[questionCnt].getQuestionText());
                if (!tf.isAnswer()) {
                    Toast.makeText(MainActivity.this, R.string.message, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.message1, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Заголовок", "Hello");
                if (tf.isAnswer()) {
                    Toast.makeText(MainActivity.this, R.string.message, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.message1, Toast.LENGTH_SHORT).show();
                }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionCnt != Questions.length) {
                    questionCnt++;
                    TextView tv = (TextView) findViewById(R.id.textView);
                    tf.setQuestionText(Questions[questionCnt].getQuestionText());
                } else {
                    questionCnt=0;
                    tf.setQuestionText(Questions[questionCnt].getQuestionText());
                }
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionCnt != 0) {
                    questionCnt--;
                    tf.setQuestionText(Questions[questionCnt].getQuestionText());
                } else {
                    questionCnt=Questions.length;
                    tf.setQuestionText(Questions[questionCnt].getQuestionText());
                }
            }
        });

    }
}