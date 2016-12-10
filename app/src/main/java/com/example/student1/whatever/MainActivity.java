package com.example.student1.whatever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int questionCnt = 0;
    private TrueFalse Questions[] = {
            new TrueFalse(R.string.question_first, false),
            new TrueFalse(R.string.question_second, true),
            new TrueFalse(R.string.question_third, true),
    };
    private TextView mQuestionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mQuestionTextView = (TextView) findViewById(R.id.textView);
        final int question = Questions[questionCnt].getTextResID();
        mQuestionTextView.setText(question);


        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button);
        Button prevBtn = (Button) findViewById(R.id.button2);
        Button nextBtn = (Button) findViewById(R.id.button3);
        Button cheatBtn = (Button) findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionCnt != Questions.length - 1) {
                    questionCnt++;
                } else {
                    questionCnt = 0;
                }
                mQuestionTextView.setText(Questions[questionCnt].getTextResID());
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionCnt != 0) {
                    questionCnt--;
                } else {
                    questionCnt = Questions.length - 1;
                }
                mQuestionTextView.setText(Questions[questionCnt].getTextResID());
            }
        });
        cheatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CheatActivity.class);
                i.putExtra("ANSWER", Questions[questionCnt].isAnswer());
                i.putExtra("QUESTION_ID", Questions[questionCnt].getTextResID());
                startActivity(i);
            }
        });
    }

    void checkAnswer() {
        if (Questions[questionCnt].isAnswer()) {
            Toast.makeText(MainActivity.this, R.string.message1, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, R.string.message, Toast.LENGTH_SHORT).show();
        }
    }


}