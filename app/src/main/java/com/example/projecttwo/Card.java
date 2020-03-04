package com.example.projecttwo;

public class Card {
    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setQuestion(String str) {
        question = str;
    }
    public void setAnswer(String str) {
        answer = str;
    }

    Card(String q, String a) {
        question = q;
        answer = a;
    }
    Card() {}
}
