package BOJ2209.b0923;

import java.util.Scanner;

public class Boj2501 {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        int cnt = 0;
        int value = 0;

        for (int i = 1; i <= x; i++) {
            if(x % i == 0)
                cnt++;

            if(cnt == y) {
                value = i;
                break;
            }
        }

        System.out.println(value);
    }
}
