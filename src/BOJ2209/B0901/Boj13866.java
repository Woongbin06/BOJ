package BOJ2209.B0901;

import java.util.Scanner;

public class Boj13866 {
    public static void main(String[] args) {
        int[] x = new int[4];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++)
            x[i] = sc.nextInt();

        int value1 = Math.min(x[0], x[1]) + Math.max(x[2], x[3]);
        int value2 = Math.max(x[0], x[1]) + Math.min(x[2], x[3]);

        System.out.println(value1 - value2);
    }
}
