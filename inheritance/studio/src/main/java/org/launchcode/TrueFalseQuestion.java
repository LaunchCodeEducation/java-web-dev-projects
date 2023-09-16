package org.launchcode;

class TrueFalseQuestion extends org.launchcode.Question {
    public TrueFalseQuestion(String questionText, boolean correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    public void displayQuestion() {
        System.out.println("Question: " + getQuestionText());
        System.out.println("True or False? (Enter 'T' or 'F'): ");
    }

    @Override
    public boolean isCorrect(Object answer) {
        if (answer instanceof String) {
            String userAnswer = ((String) answer).trim().toUpperCase(); // Convert to uppercase for case insensitivity
            return userAnswer.equals("T") && (boolean) getCorrectAnswer(); // 'T' should be true
        }
        return false; // Incorrect format for answer
    }
}
