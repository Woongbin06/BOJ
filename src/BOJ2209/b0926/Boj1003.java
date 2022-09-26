package BOJ2209.b0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1003 {
    static int[] a = new int[41];
    static int cnt0, cnt1;

    public static void main(String[] args) throws IOException {
        int n, x;
        a[0] = 0;
        a[1] = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            cnt0 = 0; cnt1 = 0;
            x = Integer.parseInt(bf.readLine());
            f(x);
            System.out.println(cnt0 + " " + cnt1);
        }
    }

    static int f(int x) {
        if(x == 0) {
            cnt0++;
            return a[x];
        }
        if(x == 1) {
            cnt1++;
            return a[x];
        }
        if(a[x] >= 1)
            return a[x];

        return a[x] = (f(x - 2) + f(x - 1));
    }
}
