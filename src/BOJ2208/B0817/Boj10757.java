import java.math.BigInteger;
import java.util.Scanner;

public class Boj10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigint1 = new BigInteger(sc.next());
        BigInteger bigint2 = new BigInteger(sc.next());

        System.out.println(bigint1.add(bigint2));
    }
}