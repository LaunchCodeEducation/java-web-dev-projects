package org.studioCh7;

public class TrueFalse extends Question{

    public TrueFalse(String question, Choices[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "TRUE or FALSE: " + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }
}
