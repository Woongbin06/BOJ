package BOJ2209.b0927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1427 {
    public static void main(String[] args) throws IOException {
        String y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        y = bf.readLine();
        int[] x = new int[y.length()];

        for (int i = 0; i < y.length(); i++) {
            x[i] = y.charAt(i) - '0';
        }

        Arrays.sort(x);
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i]);
        }
    }
}
