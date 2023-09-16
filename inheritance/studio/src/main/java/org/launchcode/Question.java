package org.launchcode;

class Question {
    private String questionText;
    private Object correctAnswer;

    public Question(String questionText, Object correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Object getCorrectAnswer() {
        return correctAnswer;
    }

    public void displayQuestion() {
        System.out.println("Question: " + questionText);
    }

    public boolean isCorrect(Object answer) {
        // Check if the provided answer is correct
        return answer.equals(correctAnswer);
    }
}
