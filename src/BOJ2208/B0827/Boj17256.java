package BOJ2208.B0827;

import java.util.Scanner;

public class Boj17256 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] c = new int[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++) {
            c[i] = sc.nextInt();
        }

        System.out.println(c[0] - a[2] + " " +  c[1] / a[1] + " " + (c[2] - a[0]));
    }
}
