package boj2210.b1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4504 {
    public static void main(String[] args) throws IOException {
        int x, y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        while (true) {
            y = Integer.parseInt(bf.readLine());
            if(y == 0)
                return;

            if(y % x == 0)
                System.out.println(y + " is a multiple of " + x + ".");
            else
                System.out.println(y + " is NOT a multiple of " + x + ".");
        }
    }
}
