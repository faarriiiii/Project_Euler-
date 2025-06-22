import java.math.BigInteger;

public class power_digit_sum {
    public static void main(String[] args) {

        BigInteger number = BigInteger.valueOf(2).pow(1000);

        String numb = number.toString();

        int sum = 0;

        for (int i = 0; i < numb.length(); i++) {

            sum = sum + Character.getNumericValue(numb.charAt(i));
        }


        System.out.println("The sum of the digits of 2^1000 is: " + sum);
    }
}