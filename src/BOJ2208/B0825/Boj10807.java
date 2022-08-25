package BOJ2208.B0825;

import java.util.Scanner;

public class Boj10807 {
    public static void main(String[] args) {
        int x, sum = 0, z;
        int[] y = new int[100];

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i = 0; i < x; i++) {
            y[i] = sc.nextInt();
        }
        z = sc.nextInt();

        for(int i = 0; i < x; i++) {
            if(y[i] == z)
                sum++;
        }

        System.out.println(sum);
    }
}
