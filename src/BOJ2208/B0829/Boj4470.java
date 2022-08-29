package BOJ2208.B0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4470 {
    public static void main(String[] args) throws IOException {
        int x;
        String y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        for(int i = 1; i <= x; i++) {
            y = bf.readLine();
            System.out.println(i + ". " + y);
        }
    }
}
