package org.studioCh7;

public class SurveyRunner {
    //static final to avoid the entire survey from getting deleted by accident.
    private static final Survey survey = new Survey();

    public static void main(String[] args){

        Choices[] trueAndFalse = {
                new Choices("True"),
                new Choices("False")
        };
        TrueFalse lactoseIntolerant = new TrueFalse("I am lactose-intolerant and need a non-dairy alternative", trueAndFalse);
        TrueFalse diabetic = new TrueFalse("I am diabetic and need a no-sugar added alternative", trueAndFalse);

        Choices[] flavorChoices = {
                new Choices("Vanilla"),
                new Choices("Chocolate"),
                new Choices("Strawberry")
        };
        MultipleChoice flavor = new MultipleChoice("What flavor of ice cream would you like?", flavorChoices);

        LinearScale numScoops = new LinearScale("How many scoops of ice cream would you like?", 3);

        Choices[] toppingChoices = {
                new Choices("Oreo crumble"),
                new Choices("Fresh strawberry slices"),
                new Choices("M&Ms"),
                new Choices("Hot caramel syrup"),
                new Choices("Pecans")
        };

        Checkbox toppings = new Checkbox("Select some toppings", toppingChoices);

        ShortAnswer flavorSuggestions = new ShortAnswer("What flavor of ice cream would you like to see added to our menu?");

        Paragraph comments = new Paragraph("Any other questions or comments");

        survey.addQuestions(new Question[] {lactoseIntolerant, diabetic, flavor, numScoops, toppings, flavorSuggestions, comments });


        String newline = System.lineSeparator();
        System.out.println("Thank you for registering for our meetup! We will be serving dessert and would like to know your preferences ahead of time." + newline);
        survey.run();

        System.out.println("Thank you! Your preferences have been noted for the upcoming event." + newline + "\t" +
                 String.join(newline + "\t", survey.getAllResponses()) + newline );
    }


}
