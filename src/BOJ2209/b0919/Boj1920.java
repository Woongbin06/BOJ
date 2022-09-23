package BOJ2209.b0919;

import java.util.Scanner;

public class Boj1920 {
    static int[] x = new int[100000];

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int cnt = 0;
            for (int j = 0; j < x.length; j++) {
                if (y == x[j])
                    cnt++;
            }
            System.out.println(cnt >= 1 ? 1 : 0);
        }
    }
}
