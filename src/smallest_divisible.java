// Q5
// Find the smallest positive number evenly divisible by all numbers between 1-20

public class smallest_divisible {
    public static void main(String[] args) {
        int num = 1;

        while (true) {
            boolean divisibleBy = true;

            for (int j = 1; j <= 20; j++) {
                if (num % j != 0) {
                    divisibleBy = false;
                    break;
                }
            }
            num++;

            if (divisibleBy) {
                System.out.println("Smallest number divisible by all numbers from 1 to 20: " + num);
                break;
            }



        }
    }
}
