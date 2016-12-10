package com.example.student1.whatever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {

    protected TextView QuestionText;
    private TextView CheatText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        Intent i = getIntent();
        int resourceID = i.getIntExtra("QUESTION_ID", 0);
        final boolean answer = i.getBooleanExtra("ANSWER", false);

        QuestionText = (TextView) findViewById(R.id.question_text);
        CheatText = (TextView) findViewById(R.id.cheatText);
        QuestionText.setText(resourceID);

        Button cheatButton = (Button) findViewById(R.id.newCheatButton);

        cheatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer) {
                    CheatText.setText(R.string.message1);
                } else {
                    CheatText.setText(R.string.message);
                }
            }

        });


    }

}
