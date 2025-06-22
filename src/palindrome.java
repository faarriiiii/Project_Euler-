// Q4
//  Find the largest palindrome made from the product of two 3 -digit numbers.
// A palindromic number reads the same both ways. The largest palindrome made from the product of two -digit numbers is .

public class palindrome {
    public static void main(String[] args) {

        int largestP = 0;



        for (int i = 999; i >0 ; i--) {
            for (int j =i; j>0; j--) {
                int mult = i * j;

                String s = String.valueOf(mult);

                boolean isPalindrome = true;

                for (int k =0; k<s.length()/2; k++) {
                    if (s.charAt(k) !=s.charAt(s.length()-1-k)) {
                        isPalindrome = false;
                        break;


                    }

                }

                if(isPalindrome && mult > largestP ) {
                    largestP = mult;

                }

            }

        }
        System.out.println(largestP);

    }
}






// int original = product;
// int reversed = 0;
  //              while (original > 0) {
// int n = original % 10;
// reversed = reversed * 10 + n;
// original /= 10;

        // Check if the product is a palindrome
   //     if (product == reversed && product > largestPalindrome) {
// largestPalindrome = product;// F1 = i;
// F2 = j;