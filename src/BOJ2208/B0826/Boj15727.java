package BOJ2208.B0826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15727 {
    public static void main(String[] args) throws IOException {
        int x, cnt = 0, value =0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        if(x % 5 == 0)
            System.out.println(x / 5);
        else
            System.out.println(x / 5 + 1);
    }
}
