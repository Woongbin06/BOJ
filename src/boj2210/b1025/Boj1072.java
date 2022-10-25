package boj2210.b1025;

import java.util.Scanner;

public class Boj1072 {
    public static void main(String[] args) {
        long x, y;
        int z, a = -1;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        z = (int) (y * 100 / x);
        if( z< 99){
            a = (int) Math.ceil((100 * y - x * (z + 1)) /  (z - 99.0));
        }

        System.out.println(a);
    }
}
