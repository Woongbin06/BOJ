package BOJ2209.B0911;

import java.util.Scanner;

public class Boj1453 {
    public static void main(String[] args) {
        int y, z, cnt = 0;
        int[] x = new int[100];

        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        for(int i = 0; i < y; i++){
            z = sc.nextInt();
            x[z]++;
            if(x[z] > 1)
                cnt++;
        }

        System.out.println(cnt);
    }
}
