package BOJ2209.b0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2822 {
    public static void main(String[] args) throws IOException {
        int[] x = new int[8];
        int[] y = new int[8];
        int[] z = new int[5];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            x[i] = Integer.parseInt(bf.readLine());
            y[i] = x[i];
        }

        Arrays.sort(x);
        int sum = 0;
        for (int i = 3; i < 8; i++)
            sum += x[i];

        System.out.println(sum);
        int cnt = 0;
        for (int i = 3; i < 8; i++) {
            for (int n = 0; n < 8; n++) {
                if(y[n] == x[i])
                    z[cnt++] = n + 1;
            }
        }

        Arrays.sort(z);
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
