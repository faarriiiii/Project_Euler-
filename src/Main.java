// Q1

public class Main {
    public static void main(String[] args) {

        // find sum of multiples of 3 or 5 below 1000

        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }

        }

        System.out.println(sum);


    }
}