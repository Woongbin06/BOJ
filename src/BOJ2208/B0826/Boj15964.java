package BOJ2208.B0826;

import java.math.BigInteger;
import java.util.Scanner;

public class Boj15964 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
        BigInteger sum = (x.add(y)).multiply(x.subtract(y));

        System.out.println(sum);
    }


}
