import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        int temp = 0;
        int rem = 0;

        System.out.print("Enter any Number :  ");
        num = input.nextInt();
        temp = num ;

        while(temp!= 0){//456
            rem = temp % 10 ; //6 -->5 --->4
            sum = sum + rem ; // 6 --> 11 ---> 15
            temp = temp / 10 ; // 45 --> 4 --> 0.4 which is 0
        }
        System.out.println("Sum of the Digits is :  "+sum);

    }
}