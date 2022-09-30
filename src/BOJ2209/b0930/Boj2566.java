package BOJ2209.b0930;

import java.io.IOException;
import java.util.Scanner;

public class Boj2566 {
    public static void main(String[] args) throws IOException {
        int[][] x = new int[9][9];
        int n = 0, m = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                x[i][j] = sc.nextInt();

        int max = x[0][0];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max <= x[i][j]) {
                    max = x[i][j];
                    n = i + 1; m = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(n + " " + m);
    }
}
