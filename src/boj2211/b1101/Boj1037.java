package boj2211.b1101;

import java.util.Scanner;

public class Boj1037 {
    public static void main(String[] args) {
        int n, min = 1000000, max = 0, x;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            max = Math.max(max, x);
            min = Math.min(min, x);
        }

        System.out.println(min * max);
    }
}
