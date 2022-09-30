package BOJ2209.b0930;

import java.util.Scanner;

public class Boj2355 {
    public static void main(String[] args) {
        long x, y;

        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        y = sc.nextLong();

        if (x <= y) {
            System.out.println((x + y) * (y - x + 1) / 2);
        }
        else {
            System.out.println((x + y) * (x - y + 1) / 2);
        }
    }
}
