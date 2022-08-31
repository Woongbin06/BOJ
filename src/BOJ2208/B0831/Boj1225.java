package BOJ2208.B0831;

import java.io.IOException;
import java.util.Scanner;

public class Boj1225 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        String x = sc.next();
        String y = sc.next();

        for(int i = 0; i < x.length(); i++) {
            for(int n = 0; n < y.length(); n++) {
                value += (x.charAt(i) - '0') * (y.charAt(n) - '0');
            }
        }

        System.out.println(value);
    }
}
