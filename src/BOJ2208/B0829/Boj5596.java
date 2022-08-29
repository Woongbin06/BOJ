package BOJ2208.B0829;

import java.util.Scanner;

public class Boj5596 {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4; i++)
            sum1 += sc.nextInt();
        for(int i = 0; i < 4; i++)
            sum2 += sc.nextInt();

        System.out.println(sum1 >= sum2 ? sum1 : sum2);
    }
}
