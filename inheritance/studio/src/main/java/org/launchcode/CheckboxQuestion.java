package org.launchcode;

import java.util.List;



class CheckboxQuestion extends Question {
    private List<String> choices;
    private List<String> correctAnswers;

    public CheckboxQuestion(String questionText, List<String> choices, List<String> correctAnswers) {
        super(questionText, correctAnswers); // Pass correctAnswers to the superclass constructor
        this.choices = choices;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void displayQuestion() {
        System.out.println("Question: " + getQuestionText());
        System.out.println("Choices:");
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((char)('A' + i) + ") " + choices.get(i)); // Use letters (A, B, C, ...) for choices
        }
        System.out.println("Select multiple choices separated by commas (e.g., A, C): ");
    }

    @Override
    public boolean isCorrect(Object answer) {
        if (answer instanceof String) {
            String[] selectedChoices = ((String) answer).split(",");
            for (String choice : selectedChoices) {
                choice = choice.trim(); // Remove leading/trailing whitespace
                if (!correctAnswers.contains(choice)) {
                    return false; // If any choice is not correct, the answer is incorrect
                }
            }
            return true;
        }
        return false; // Incorrect format for answer
    }
}
