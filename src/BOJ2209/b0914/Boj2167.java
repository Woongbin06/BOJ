package BOJ2209.b0914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boj2167 {
    public static void main(String[] args) throws IOException {
        int[][] x = new int[300][300];
        int[] a = new int[4];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int z = sc.nextInt();

        for(int i = 0; i < y; i++)
            for (int n = 0; n < z; n++)
                x[i][n] = sc.nextInt();

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            sum = 0;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            int d = sc.nextInt() - 1;
            int e = sc.nextInt() - 1;

            for (int n = b; n <= d; n++) {
                for(int j = c; j <= e; j++){
                    sum += x[n][j];
                }
            }
            System.out.println(sum);
        }
    }
}
