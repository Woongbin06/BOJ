package BOJ2209.b0914;

import java.util.Scanner;

public class Boj2693 {
    public static void main(String[] args) {
        int n;
        int[] x = new int[10];

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++)
                x[j] = sc.nextInt();

            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    if (x[j] > x[k]) {
                        int swap = x[j];
                        x[j] = x[k] ;
                        x[k] = swap;
                    }
                }
            }

            System.out.println(x[2]);
        }
    }
}
