package BOJ2209.B0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15873 {
    public static void main(String[] args) throws IOException {
        int x;
        int sum;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        sum = (x / 10) + (x % 10);
        if(x / 10 > 10)
            sum = (x / 100) + (x % 100);
        if(x == 1010)
            sum = 20;

        System.out.println(sum);
    }
}
