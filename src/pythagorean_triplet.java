//Q9

public class pythagorean_triplet {
    public static void main(String[] args) {
        int target = 1000;

        for (int a = 1; a < target; a++) {
            for (int b = a + 1; b < target; b++) {
                int c = target - a - b;

                if (a * a + b * b == c * c) {
                    System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                    System.out.println("Product abc: " + (a * b * c));
                }
            }
        }
    }
}
