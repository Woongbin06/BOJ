package boj2210.b1001;

import java.util.Arrays;
import java.util.Scanner;

public class Boj2947 {
    public static void main(String[] args) {
        int[] x = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }

        for (int n = 0; n < 5; n++) {
            if (x[0] > x[1]) {
                int swap = x[0];
                x[0] = x[1];
                x[1] = swap;
                for (int i = 0; i < 5; i++) {
                    System.out.print(x[i] + " ");
                }
                System.out.println();
            }
            if (x[1] > x[2]) {
                int swap = x[1];
                x[1] = x[2];
                x[2] = swap;
                for (int i = 0; i < 5; i++) {
                    System.out.print(x[i] + " ");
                }
                System.out.println();
            }
            if (x[2] > x[3]) {
                int swap = x[2];
                x[2] = x[3];
                x[3] = swap;
                for (int i = 0; i < 5; i++) {
                    System.out.print(x[i] + " ");
                }
                System.out.println();
            }
            if (x[3] > x[4]) {
                int swap = x[3];
                x[3] = x[4];
                x[4] = swap;
                for (int i = 0; i < 5; i++) {
                    System.out.print(x[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
