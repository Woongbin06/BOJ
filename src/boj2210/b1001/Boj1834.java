package boj2210.b1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1834 {
    public static void main(String[] args) throws IOException {
        int x;
        long sum = 0L;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        for (int i = 1; i < x; i++) {
            sum += (long) (x + 1) * i;
        }

        System.out.println(sum);
    }
}
