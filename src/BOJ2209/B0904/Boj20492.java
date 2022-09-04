package BOJ2209.B0904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj20492 {
    public static void main(String[] args) throws IOException {
        int x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        int value1 = (int) (x * 0.78);
        int value2 = (int)(x * 0.2);
        System.out.print(value1);
        System.out.print(" ");
        System.out.print((int)x - (int)(value2 * 0.22));
    }
}
