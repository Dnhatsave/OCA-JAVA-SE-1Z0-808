package com.sydevelop.TesteJava;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String questionLabel;
    private String content;


    public Answer(String questionLabel, String content){
        this.questionLabel = questionLabel;
        this.content = content;
    }



    public String getQuestionLabel() {
        return questionLabel;
    }

    public String getContent() {
        return content;
    }
}
