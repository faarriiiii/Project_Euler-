// Q7
public class prime_numbers {
    public static void main(String[] args) {

        int target =10001;
        int n = 20000000;
        boolean[] isPrime = new boolean[n + 1];
        int count = 0;
        int primeNumber = 0;

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sieve algorithm
        for (int j = 2; j * j <= n; j++) {
            if (isPrime[j]) {
                for (int i = j * j; i <= n; i = i + j) { // checking for multiples of j
                    isPrime[i] = false;
                }
            }
        }

        // Print primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                primeNumber = i;
                if (count == target) {
                    break;
                }
            }
        }

        System.out.println("The " + target + "th prime number is: " + primeNumber);
    }
}