package BOJ2209.B0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15873 {
    public static void main(String[] args) throws IOException {
        String x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = bf.readLine();

        int n = x.charAt(0) - '0';
        if(x.charAt(1) == '0')
            n = n * 10 + (x.charAt(1) - '0');
        int m = x.charAt(2) - '0';
        if(x.charAt(3) == '0')
            m = m * 10 + (x.charAt(3) - '0');

        System.out.println(n + m);
    }
}
