package BOJ2208.B0830;

import java.util.Scanner;

public class Boj10797 {
    public static void main(String[] args) {
        int x, cnt = 0;
        int[] y = new int[5];

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            y[i] = sc.nextInt();
            if (y[i] % 10 == x)
                cnt++;
        }

        System.out.println(cnt);
    }
}
