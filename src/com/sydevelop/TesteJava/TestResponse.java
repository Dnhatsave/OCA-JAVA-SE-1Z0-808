package com.sydevelop.TesteJava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestResponse {

    private String name;
    private Date date;
    private List<Answer> answers = new ArrayList<>();

    public List<Answer> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        System.out.println("You have " + answers.size() + " Answers in your list");
        for (int i = 0; i < answers.size(); i++) {
            return  (i+1)+  ". " + answers.get(i);
        }
        return super.toString();
    }
}
