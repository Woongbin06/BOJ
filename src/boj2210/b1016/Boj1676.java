package boj2210.b1016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1676 {
    public static void main(String[] args) throws IOException {
        int x, cnt = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        while (x > 4) {
            cnt += x / 5;
            x /= 5;
        }
        System.out.println(cnt);
    }
}
