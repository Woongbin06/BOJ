package BOJ2208.B0828;

import java.util.Scanner;

public class Boj2083 {
    public static void main(String[] args) {
        String x;
        int a, b;

        Scanner sc = new Scanner(System.in);

        while(true) {
            x = sc.next();
            a = sc.nextInt();
            b = sc.nextInt();

            if(x.charAt(0) == '#' && a == 0 && b == 0)
                return;

            if(a > 17 || b >= 80)
                System.out.println(x + " Senior");
            else
                System.out.println(x + " Junior");
        }
    }
}
