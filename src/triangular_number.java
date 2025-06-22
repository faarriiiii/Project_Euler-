// Q12, What is the value of the first triangle number to have over five hundred divisors?

public class triangular_number {
    public static void main(String args[]) {

        int triangularNumber = 0;
        int number = 1;
        int divisorCount = 0;

        while (divisorCount <= 500) {
            triangularNumber = triangularNumber + number; //1+0= 1, 1+2 = 3, 3+3 = 6, 6+4 =10... 36
            number++; // 2, 3, 4, 5
            divisorCount = 0;


            // counts the divisors
            for (int i = 1; i <= Math.sqrt(triangularNumber); i++) {
                if (triangularNumber % i == 0) {
                    divisorCount = divisorCount + ((i * i == triangularNumber) ? 1 : 2);

                }
            }
        }
        System.out.println("Triangular Number: " + triangularNumber + ", Divisors: " + divisorCount);
    }
}

//   for (int j = 1; j <= 500; j++) {
//            triangularNumber = triangularNumber + j;
//            System.out.println("Triangular number" + " " + j + " = " + triangularNumber);