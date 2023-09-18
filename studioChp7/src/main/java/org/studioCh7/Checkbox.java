package org.studioCh7;

public class Checkbox extends Question{

    public Checkbox(String question, Choices[] choiceArray) {
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE OR MORE:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choices choice : getChoiceMap().values()) {
            if (choice.isCorrect()){
                numCorrect++;
            }
        }
        return numCorrect;
    }
}
