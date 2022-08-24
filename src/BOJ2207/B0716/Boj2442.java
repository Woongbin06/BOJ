package BOJ2207.B0716;

import java.util.Scanner;

public class Boj2442 {
    public static void main(String[] args) {
        int x, y, z;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i = 1; i <= x; i++, System.out.println(" ")) {
            for (int n = i; n < x; n++)
                System.out.print(" ");
            for (int n = 1; n < i * 2; n++)
                System.out.print("*");
        }
    }
}
