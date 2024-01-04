package questions;

import java.awt.*;

public class TrueOrFalse extends Question{

    public TrueOrFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    void publicTrueOrFalse(String question, Choice[] choiceArray) {
        super(question, ChoiceArray);

    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "True Or False:"  +newline +
        getQuestion() + newline +
                getFormattedChoices();
       // return null;
    }
}
