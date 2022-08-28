package BOJ2208.B0826;

import java.util.Scanner;

public class Boj14652 {
    public static void main(String[] args) {
        int a, b ,c, cnt = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        for(int i = 0; i < a; i++) {
            for (int n = 0; n < b; n++) {
                if(cnt == c) {
                    System.out.println(i + " " + n);
                }
                cnt++;
            }
        }


    }
}
