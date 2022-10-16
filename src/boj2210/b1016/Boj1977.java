package boj2210.b1016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1977 {
    public static void main(String[] args) throws IOException {
        int x, y, sum = 0, min = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());
        y = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= y; i++) {
            if (i * i >= x && i * i <= y) {
                sum += i * i;
                if (min == 0) {
                    min = i * i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
