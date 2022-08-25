package BOJ2208.B0825;

import java.util.Scanner;

public class Boj8370 {
    public static void main(String[] args) {
        int[] x = new int[4];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println((x[0] * x[1]) + (x[2] * x[3]));
    }
}
