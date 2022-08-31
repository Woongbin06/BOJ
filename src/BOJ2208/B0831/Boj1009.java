package BOJ2208.B0831;

import java.math.BigInteger;
import java.util.Scanner;

public class Boj1009 {
    public static void main(String[] args) {
        int x, b, a;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            int value = 1;
            for(int n = 0; n < b; n++) {
                value = (value * a) % 10;
            }
            if(value == 0)
                value = 10;
            System.out.println(value);
        }
    }
}
