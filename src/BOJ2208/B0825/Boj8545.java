package BOJ2208.B0825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj8545 {
    public static void main(String[] args) throws IOException {
        String x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = bf.readLine();

        for(int i = x.length() - 1; i >= 0; i--) {
            System.out.print(x.charAt(i));
        }
    }
}
