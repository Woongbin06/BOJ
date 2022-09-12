package BOJ2209.B0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2857 {
    public static void main(String[] args) throws IOException {
        String x;
        int cnt = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            x = bf.readLine();
            if (x.contains("FBI")) {
                System.out.print(i + 1 + " ");
                cnt++;
            }
        }

        if (cnt == 0)
            System.out.println("HE GOT AWAY!");
    }
}
