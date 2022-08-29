package BOJ2208.B0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5554 {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(bf.readLine());
        }

        System.out.println(sum / 60 + "\n" + sum % 60);
    }
}
