package BOJ2208.B0824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4999 {
    public static void main(String[] args) throws IOException {
        String x, y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = bf.readLine();
        y = bf.readLine();

        System.out.println(x.length() >= y.length() ? "go" : "no");
    }
}
