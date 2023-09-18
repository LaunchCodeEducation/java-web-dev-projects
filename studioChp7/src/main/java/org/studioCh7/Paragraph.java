package org.studioCh7;

public class Paragraph extends Question{


    public Paragraph(String question) {
        super(question);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + getQuestion() + newline +
                "Please enter a response (500 characters max):" + newline;
    }

    @Override
    public boolean isInvalid(String resp){
        return resp.length() >= 500;
    }


}
