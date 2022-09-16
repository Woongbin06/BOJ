package BOJ2209.b0916;

import java.util.Scanner;

public class Boj1145 {
    public static void main(String[] args) {
        int[] x = new int[5];
        int cnt, n = 1;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
            x[i] = sc.nextInt();

        while (true) {
            cnt = 0;
            for(int i = 0 ; i < 5; i++)
                if(n % x[i] == 0)
                    cnt++;
            if (cnt >= 3) {
                System.out.println(n);
                return;
            }
            n++;
        }
    }
}
