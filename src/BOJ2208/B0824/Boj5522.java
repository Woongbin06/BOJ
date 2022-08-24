package BOJ2208.B0824;

import java.util.Scanner;

public class Boj5522 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
            sum += sc.nextInt();

        System.out.println(sum);
    }
}
