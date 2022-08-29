package BOJ2208.B0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5532 {
    public static void main(String[] args) throws IOException {
        int l, value, value2;
        int[] x = new int[4];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        l = Integer.parseInt(bf.readLine());

        for (int i = 0; i < 4; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }
        value = x[0] / x[2];
        if(x[0] % x[2] != 0)
            value++;
        value2 = x[1] / x[3];
        if(x[1] % x[3] != 0)
            value2++;

        System.out.println(value > value2 ? l - value : l - value2);
    }
}
