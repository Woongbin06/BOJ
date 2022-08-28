package BOJ2208.B0828;

import java.util.Scanner;

public class Boj2845 {
    public static void main(String[] args) {
        int x, y, a;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        for(int i = 0; i < 5; i++){
            a = sc.nextInt();
            System.out.print(a - (x * y) + " ");
        }


    }
}
