package BOJ2208.B0830;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10808 {
    public static void main(String[] args) throws IOException {
        String x;
        int[] cnt = new int[124];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = bf.readLine();

        for (int i = 0; i < x.length(); i++) {
            for(int n = 97; n < 123; n++) {
                if(x.charAt(i) == n) {
                    cnt[n]++;
                }
            }
        }

        for (int i = 97; i < 123; i++) {
            System.out.print(cnt[i] + " ");
        }
    }
}
