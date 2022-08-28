package BOJ2208.B0828;

import java.util.Scanner;

public class Boj2752 {
    public static void main(String[] args) {
        int[] x = new int[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++) {
            for(int n = i; n < 3; n++) {
                if(x[i] > x[n]) {
                    int swap = x[i];
                    x[i] = x[n];
                    x[n] = swap;
                }
            }
        }

        for(int i = 0; i < 3; i++)
            System.out.print(x[i] + " ");
    }
}
