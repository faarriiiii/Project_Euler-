// Q6
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class sum_of_sqaure {
    public static void main(String[] args) {


        int square;
        int sumCount = 0;
        int sumCount1 = 0;
        int squaresum;
        int difference;

        for (int i = 1; i<=100; i++) {
            for (int j = i; j<=i; j++) {

                square = j*i;
                sumCount = sumCount + square;

            }

        }
        System.out.println(sumCount);


        for (int i = 1; i<=100; i++) {
            sumCount1 = sumCount1 + i;

        }
        squaresum = sumCount1*sumCount1;
        System.out.println(squaresum);


        difference = squaresum - sumCount;
        System.out.println(difference);


    }
}



//
//public class Main
//// System.out.println(i);
//{
//	public static void main(String[] args) {
//
//	    int mult = 0;
//	    int sum = 0; // sum of squares
//	    int sum2 = 0;
//	    int mult2 = 0;
//	    int diff = 0;
//
//	    for (int i = 1; i<=100; i++) {
//	            mult = i * i;
//	            sum = sum + mult;
//
//	            sum2 = sum2 + i;
//
//
//	    }
//
//	    mult2 = sum2 * sum2;
//	    diff =  mult2 - sum;
//
//	    System.out.println("Sum of squares is : " + sum);
//	    System.out.println("Square of sum is : " + mult2);
//	    System.out.println("Difference is : " +  diff);
//
//	}
//}
//