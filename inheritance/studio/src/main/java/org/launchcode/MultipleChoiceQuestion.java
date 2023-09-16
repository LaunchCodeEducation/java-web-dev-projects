package org.launchcode;

import java.util.List;

class MultipleChoiceQuestion extends Question {
    private List<String> choices;

    public MultipleChoiceQuestion(String questionText, List<String> choices, String correctAnswer) {
        super(questionText, correctAnswer);
        this.choices = choices;
    }

    @Override
    public void displayQuestion() {
        System.out.println("Question: " + getQuestionText());
        System.out.println("Choices:");
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
    }

    public void displayAnswer() {
        System.out.println("Correct Answer: " + getCorrectAnswer());
    }
}
