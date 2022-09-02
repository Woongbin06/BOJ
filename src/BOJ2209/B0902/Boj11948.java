package BOJ2209.B0902;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj11948 {
    public static void main(String[] args) throws IOException {
        int n, sum = 0;
        int[] x = new int[4];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 4; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(x);
        for(int i = 1; i < 4; i++) {
            sum += x[i];
        }
        for(int i = 0; i < 2; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }
        sum += x[0] > x[1] ? x[0] : x[1];

        System.out.println(sum);
    }
}
