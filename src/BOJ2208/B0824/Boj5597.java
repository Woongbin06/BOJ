package BOJ2208.B0824;

import java.util.Scanner;

public class Boj5597 {
    public static void main(String[] args) {
        int[] x = new int[31];
        int y;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 28; i++){
            y = sc.nextInt();
            x[y] = 1;
        }

        for(int i = 1; i <= 30; i++){
            if(x[i] == 0)
                System.out.println(i);
        }
    }
}
