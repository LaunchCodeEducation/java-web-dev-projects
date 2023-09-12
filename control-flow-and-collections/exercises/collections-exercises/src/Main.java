import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split("\\.");
        System.out.println(Arrays.toString(words));


        ArrayList<Integer> digits = new ArrayList<Integer>(
          Arrays.asList(1,2,3,4,5,6,7,8,9,10)
        );
        SumEven.sumEven(digits);
        System.out.println(SumEven.sumEven(digits));


    }
}