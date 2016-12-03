package com.example.student1.whatever;

import org.w3c.dom.Text;

public class TrueFalse {
    String questionText;
    boolean answer;

    public TrueFalse(String questionText, boolean answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public void setQuestionText(String x) {
        this.questionText = x;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public boolean isAnswer() {
        return answer;
    }
}
