package org.example;

import java.util.HashMap;

public class MultipleChoiceQuestion extends Question {
    //private String[] wrongAnswers;
    public MultipleChoiceQuestion(String prompt, HashMap<String, Boolean> qna) {
        super(prompt, qna);
        //this.wrongAnswers = wrongAnswers;
        //this.id = nextId;
        //super.describe();
    }

    @Override
    public String describe() {
        String newline = System.lineSeparator();
        String pipe = " | ";
        return getPrompt() + " " + String.join(", ", getQna().keySet());
    }



}
