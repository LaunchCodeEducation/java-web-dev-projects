import java.util.Arrays;

public class DrSeuss {
    public static String arrPractice2(String[] args) {
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = quote.split(" ");
        System.out.println(Arrays.toString(words));
        return quote;
    }
}
