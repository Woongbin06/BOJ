package BOJ2208.B0824;

import java.util.Scanner;

public class Boj3733 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        while(sc.hasNext()){
            x = sc.nextInt();
            y = sc.nextInt();

            System.out.println(y / (x + 1));
        }
    }
}
