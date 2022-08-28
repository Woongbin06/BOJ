package BOJ2208.B0828;

import java.util.Scanner;

public class Boj2530 {
    public static void main(String[] args) {
        int x, y, z, time, value;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        time = sc.nextInt();

        z += time;
        y += z / 60;
        z %= 60;
        x += y / 60;
        y = y % 60;
        if(x >= 24) {
            x %= 24;
        }

        System.out.println(x + " " + y + " " + z);
    }
}
