import java.math.BigInteger;
import java.util.Scanner;

public class Boj1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();

        System.out.println(x.divide(y) + "\n" + x.remainder(y));
    }
}
