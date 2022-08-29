package BOJ2208.B0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5543 {
    public static void main(String[] args) throws IOException {
        int[] x = new int[5];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }

        System.out.println(Math.min(x[0], Math.min(x[1], x[2])) + Math.min(x[3], x[4]) - 50);
    }
}
