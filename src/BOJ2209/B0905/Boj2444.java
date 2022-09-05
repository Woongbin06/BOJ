package BOJ2209.B0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2444 {
    public static void main(String[] args) throws IOException {
        int x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        for(int i = 0 ; i < x; i++, System.out.println()) {
            for(int n = i; n < x - 1; n++)
                System.out.print(" ");
            for(int n = 0; n < i * 2 + 1; n++) {
                System.out.print("*");
            }
        }
        for(int i = x - 2; i >= 0; i--, System.out.println()){
            for(int n = i; n < x - 1; n++)
                System.out.print(" ");
            for(int n = i * 2; n >= 0; n--)
                System.out.print("*");
        }
    }
}
