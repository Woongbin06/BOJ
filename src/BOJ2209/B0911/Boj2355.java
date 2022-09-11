package BOJ2209.B0911;

import java.util.Scanner;

public class Boj2355 {
    public static void main(String[] args) {
        int x, y, sum = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        for(int i = x; i <= y; i++)
            sum += i;

        System.out.println(sum);
    }
}
