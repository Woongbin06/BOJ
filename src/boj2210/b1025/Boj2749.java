package boj2210.b1025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2749 {
    static int[] memo = new int[21];

    public static void main(String[] args) throws IOException {
        int n;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        System.out.println(f(n));
    }

    static int f(int x) {
        if (x == 0)
            return 0;
        else if (x < 3)
            return 1;
        else if (memo[x] >= 1)
            return memo[x];
        return memo[x] = f(x - 2) + f(x - 1);
    }
}
