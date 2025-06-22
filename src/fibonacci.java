// Q2
// By considering the terms in the Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.

// ♡ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,… ( 0+1, 1+1, 2+1) ♡

public class fibonacci {
    public static void main(String[] args) {


        //1,2,3,5,8
        ///1,2,3,4,5

        //1,


        int F1 = 0;
        int F2 = 1;
        int Ft = 0;

        int sum = 0;


        while (Ft <= 4000000) {
            Ft = F1 + F2;

            if (Ft % 2 == 0) {
                sum = sum + Ft;
            }
            F1 = F2;
            F2 = Ft;
        }
        System.out.println(sum);

    }
}