package BOJ2209.b0929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2478 {
    static long[] memo = new long[91];

    public static void main(String[] args) throws IOException {
        int x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        System.out.println(f(x));
    }

    static Long f(int n) {
        if (memo[n] != 0)
            return memo[n];
        if(n == 0)
            return 0L;
        if(n <= 2)
            return 1L;
        return memo[n] = f(n - 1) + f(n - 2);
    }
}
