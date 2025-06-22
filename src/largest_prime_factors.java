// Q3
// largest prime factor of 600851475143?

public class largest_prime_factors {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largest = 0;


        for (long i = 2; i <= number; i++) {
            while (number % i == 0) {
                number = number / i;
                largest = i;
                System.out.print(i + " ");
            }
        }

        System.out.println("Largest prime factor: " + largest);
    }
}

