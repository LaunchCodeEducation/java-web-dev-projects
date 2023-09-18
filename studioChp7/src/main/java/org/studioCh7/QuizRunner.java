package org.studioCh7;

public class QuizRunner {

    private static final Quiz quiz = new Quiz();

    public static void main(String[] args){

        String q1 = "Which of the following are books by Jane Austen?";
        Choices[] q1Choices = new Choices[]{
                new Choices("Jane Eyre"),
                new Choices("Pride and Prejudice", true),
                new Choices("Lives and Daughters"),
                new Choices("Mansfield Park", true)

        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The most-published author of all time is Agatha Christie.";
        Choices[] q2Choices = new Choices[]{
                new Choices("True", true),
                new Choices("False")
        };
        TrueFalse question2 = new TrueFalse(q2, q2Choices);

        String q3 = "Which Poem did history-making poet Amanda Gorman recite at the U.S. presidential inaugration in 2021?";
        Choices[] q3Choices = new Choices[]{
                new Choices("The Hill We Climb", true),
                new Choices("The Miracle of Morning"),
                new Choices("We Rise"),
                new Choices("New Day's Lyric")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        //ADD QUESTIONS TO QUIZ
        quiz.addQuestions(new Question[] { question1, question2, question3 });


        //Interact with the user
        quiz.run();
        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);


    }
}
