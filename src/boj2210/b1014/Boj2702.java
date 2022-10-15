package boj2210.b1014;

import java.util.Scanner;

public class Boj2702 {
    public static void main(String[] args) {
        int n, x, y;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y  = sc.nextInt();

            for (int j = Math.max(x, y); j <= x * y; j++) {
                if (j % x == 0 && j % y == 0) {
                    System.out.print(j + " ");
                    break;
                }
            }
            for (int j = Math.min(x, y); j >= 1; j--) {
                if (x % j == 0 && y % j == 0) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
