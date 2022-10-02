package boj2210.b1002;

import java.io.IOException;
import java.util.Scanner;

public class Boj2581 {
    public static void main(String[] args) throws IOException {
        int x, y, sum = 0, min = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            int cnt = 0;
            for (int n = 2; n <= i; n++)
                if (i % n == 0)
                    cnt++;

            if (sum == 0)
                min = i;
            if (cnt == 1)
                sum += i;
        }

        if (sum == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
