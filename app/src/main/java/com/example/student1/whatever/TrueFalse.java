package com.example.student1.whatever;


public class TrueFalse {
    private int textResID;
    private boolean answer;
    private boolean isCheated = false;

    public TrueFalse(int mTextResID, boolean answer) {
        this.textResID = mTextResID;
        this.answer = answer;
    }

    public void setTextResID(int x) {
        this.textResID = x;
    }

    public int getTextResID() {
        return textResID;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setCheated(boolean cheated) {
        this.isCheated = cheated;
    }

    public boolean isCheated() {
        return isCheated;
    }
}
