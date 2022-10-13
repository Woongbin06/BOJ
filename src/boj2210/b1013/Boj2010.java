package boj2210.b1013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boj2010 {
    public static void main(String[] args) throws IOException {
        int x, sum = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        sum = sc.nextInt();
        for (int i = 0; i < x - 1; i++) {
            sum += sc.nextInt() - 1;
        }

        System.out.println(sum);
    }
}