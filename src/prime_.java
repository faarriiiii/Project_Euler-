//Q7
public class prime_ {
    public static void main(String[] args) {


        int primeCount = 0;
        int target = 10001;
        int number = 2; // Start checking from 2 (the first prime)

        for (int i = 2; primeCount < target; i++) {

            // Check if `i` is prime using a nested for loop
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) { // or i -1
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeCount++;
                number = i;
            }
        }

        System.out.println("The 10,001st prime number is: " + number);
    }
}
// public class Main {
//    public static void main(String[] args) {
//
//        int count = 0;
//        long num = 2;
//        long nth = 10001;
//
//        while (true) {
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
//                count++;
//                if (count == nth) {
//                    System.out.println(num);
//                    break;
//                }
//            }
//
//            num++;
//        }
//    }
//}/