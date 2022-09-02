package BOJ2209.B0901;

import java.util.Scanner;

public class Boj13866 {
    public static void main(String[] args) {
        int[] x = new int[4];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++)
            x[i] = sc.nextInt();

        System.out.println(Math.abs((x[0] + x[3]) - (x[1] + x[2])));
    }
}
