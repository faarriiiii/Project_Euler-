//10
public class sum_of_all_primes {
    public static void main(String[] args) {
        long sum = 0;
        int limit = 1000;


        for (int i = 2; i < limit; i++) {

            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If i is prime, add it to the sum
            if (isPrime) {
                sum += i;
            }
        }

        // Print the result
        System.out.println("Sum of prime numbers below " + limit + " is: " + sum);
    }
}
// public class Main {
//    public static void main(String[] args) {
//
//        long sum = 0;
//        long num = 2;
//        long lim = 2000000;
//
//
//        while (num < lim) {
//
//            boolean isPrime = true;
//
//            for (long i = 2; i <= Math.sqrt(num); i++) {
//
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                sum = sum + num;
//
//            }
//
//            num++;
//
//        }
//         System.out.println(sum);
//    }
//}//