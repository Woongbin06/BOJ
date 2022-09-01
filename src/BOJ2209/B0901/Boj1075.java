package BOJ2209.B0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1075 {
    public static void main(String[] args) throws IOException {
        int x, y;
        int a = 0, b = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());
        y = Integer.parseInt(bf.readLine());

        for(int i = x; i >= x - 100; i--) {
            if(i % y == 0) {
                a = i / 10;
                a = i % 10;
            }
        }
        System.out.println(a);
    }
}