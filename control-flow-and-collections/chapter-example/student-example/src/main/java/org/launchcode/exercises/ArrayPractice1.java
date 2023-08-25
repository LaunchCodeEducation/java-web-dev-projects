package exercises;

public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] randoNums = {1, 1, 2, 3, 5, 8};

        for(int i : randoNums) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
