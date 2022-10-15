package boj2210.b1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2747 {

    static int[] x = new int[46];

    public static void main(String[] args) throws IOException {
        x[0] = 0;
        x[1] = 1;
        x[2] = 1;
        x[3] = 2;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(f(Integer.parseInt(bf.readLine())));
    }

    static int f(int a) {
        if(x[a] > 0) return x[a];
        return x[a] = f(a - 1) + f(a - 2);
    }
}
