package BOJ2209.b0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1789 {
    public static void main(String[] args) throws IOException {
        long x, sum = 0L;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Long.parseLong(bf.readLine());

        for (int i = 1; true; i++) {
            sum += i;
            if(x < sum) {
                System.out.println(i - 1);
                return;
            } else if (x == sum) {
                System.out.println(i);
                return;
            }
        }
    }
}
