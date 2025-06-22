import java.math.BigInteger;

public class bigINt {
    public static void main(String[] args) {

        BigInteger F1 = BigInteger.ONE;
        BigInteger F2 = BigInteger.ONE;
        BigInteger Ft;

        int index = 2;

        while (F2.toString().length() < 3) {
            Ft = F1.add(F2);
            F1 = F2;
            F2 = Ft;
            index++;
        }

        System.out.println(index);
    }
}
