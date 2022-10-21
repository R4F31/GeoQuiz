package com.example.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    //GETTERS SETTERS
    public int getTextResId() {
        return mTextResId;
    }
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    //METODO
    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }


}
