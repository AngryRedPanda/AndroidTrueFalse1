package com.example.student1.whatever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {
private TextView QuestionText;
    private TextView CheatText;
    Intent i = getIntent();
    final int resourseID = i.getIntExtra("QUESTION_ID", 0);
    boolean answer = i.getBooleanExtra("ANSWER", false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        QuestionText = (TextView) findViewById(R.id.question_text);
        Button cheatButton = (Button) findViewById(R.id.newCheatButton);
        CheatText = (TextView) findViewById(R.id.cheatText);
        QuestionText.setText(resourseID);
        cheatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer) {
                    CheatText.setText(R.string.message);
                }
                CheatText.setText(R.string.message1);
            }
        });
    }

}
