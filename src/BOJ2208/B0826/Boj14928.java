package BOJ2208.B0826;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.math.BigInteger;

public class Boj14928 {
    public static void main(String[] args) throws IOException {
        BigInteger x;
        String z;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        z = bf.readLine();
        x = new BigInteger(z);
        BigInteger y = new BigInteger("20000303");
        System.out.println(x.remainder(y));
    }
}
