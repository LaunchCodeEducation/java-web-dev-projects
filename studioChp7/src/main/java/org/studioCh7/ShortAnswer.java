package org.studioCh7;

public class ShortAnswer extends Question{

    public ShortAnswer(String question) {
        super(question);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + getQuestion() + newline +
        "Please enter a response (80 characters max):" + newline;
    }

    @Override
    public boolean isInvalid(String resp){
        return resp.length() >= 80;
    }


}
