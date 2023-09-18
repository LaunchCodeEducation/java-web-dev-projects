package org.studioCh7;



public class MultipleChoice extends Question{

    public MultipleChoice(String question, Choices[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString(){
        String newline = System.lineSeparator();
        return newline+ "CHOOSE ONE:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }
}
