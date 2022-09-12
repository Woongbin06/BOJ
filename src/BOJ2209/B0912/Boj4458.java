package BOJ2209.B0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4458 {
    public static void main(String[] args) throws IOException {
        int x;
        String y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        for(int i = 0; i < x; i++) {
            y = bf.readLine();
            System.out.println((y.charAt(0) + "").toUpperCase() + y.substring(1, y.length()));
        }
    }
}
