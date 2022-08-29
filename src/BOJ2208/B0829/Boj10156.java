package BOJ2208.B0829;

import java.util.Scanner;

public class Boj10156 {
    public static void main(String[] args) {
        int x, y, z, value;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        value = x * y;
        System.out.println(value <= z ? "0" : value - z);
    }
}
