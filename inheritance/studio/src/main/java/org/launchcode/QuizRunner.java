package org.launchcode;

import java.util.Arrays;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {
        // Create a quiz
        Quiz quiz = new Quiz();

        // Sample Multiple Choice Question
        List<String> mcChoices = Arrays.asList(
                "A) Paris",
                "B) London",
                "C) New York",
                "D) Tokyo"
        );
        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of France?", mcChoices, "A"));

        // Sample Checkbox Question
        List<String> cbChoices = Arrays.asList(
                "A) Red",
                "B) Blue",
                "C) Green",
                "D) Yellow"
        );
        List<String> cbCorrectAnswers = Arrays.asList("A", "C");
        quiz.addQuestion(new CheckboxQuestion("Select the primary colors:", cbChoices, cbCorrectAnswers));

        // Sample True/False Question
        quiz.addQuestion(new TrueFalseQuestion("Is the sky blue?", true));

        // Run the quiz
        System.out.println("Welcome to the Quiz!");
        quiz.runQuiz();

        // Grade the quiz
        quiz.gradeQuiz();
    }
}
