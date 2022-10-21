package boj2210.b1021;

import java.util.Scanner;

public class Boj1236 {
    public static void main(String[] args) {
        int x, y, cnt2 = 0;
        String a;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = 0; i < x; i++) {
            a = sc.next();
            int cnt1 = 0;
            for (int n = 0; n < y; n++) {
                if (a.charAt(n) == 'X') {
                    cnt1++;
                }
            }
            if (cnt1 == 0) {
                cnt2++;
            }
        }
        System.out.println(cnt2);
    }
}
