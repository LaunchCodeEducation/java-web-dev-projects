package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            question.displayQuestion();
            String userAnswer = scanner.nextLine();

            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        scanner.close();
    }

    public void gradeQuiz() {
        System.out.println("Quiz Score: " + score + "/" + questions.size());
    }
}
