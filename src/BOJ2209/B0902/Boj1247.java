package BOJ2209.B0902;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Boj1247 {
    public static void main(String[] args) throws IOException {
        int x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
            x = Integer.parseInt(bf.readLine());
            BigInteger sum = new BigInteger("0");

            for(int j = 0; j < x; j++) {
                sum = sum.add(new BigInteger(bf.readLine()));
            }
            if(sum.compareTo(BigInteger.ZERO) > 0)
                System.out.println("+");
            else if(sum.compareTo(BigInteger.ZERO) < 0)
                System.out.println("-");
            else
                System.out.println("0");
        }
    }
}
