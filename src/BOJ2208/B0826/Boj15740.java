package BOJ2208.B0826;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj15740 {
    public static void main(String[] args) throws IOException {
        BigInteger x, y;
        String[] a = new String[2];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        a = bf.readLine().split(" ");
        x = new BigInteger(a[0]);
        y = new BigInteger(a[1]);

        System.out.println(x.add(y));
    }
}
