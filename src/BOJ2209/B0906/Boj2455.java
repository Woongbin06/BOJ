package BOJ2209.B0906;

import java.util.Scanner;

public class Boj2455 {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);
        int big = sc.nextInt() + sc.nextInt();
        int value = big;
        for(int i = 0; i < 3; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if(big < value + (y - x))
                big = value + (y - x);

            value += y - x;
        }
        System.out.println(big);
    }
}
