package BOJ2209.B0907;

import java.util.Scanner;

public class Boj2506 {
    public static void main(String[] args) {
        int x, sum = 0, cnt = 1;
        int[] y = new int[100];

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for(int i = 0; i < x; i++)
            y[i] = sc.nextInt();

        for(int i = 0; i < x; i++){
            if (y[i] == 1)
                sum += cnt++;
            else
                cnt = 1;
        }

        System.out.println(sum);
    }
}
