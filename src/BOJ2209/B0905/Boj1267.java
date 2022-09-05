package BOJ2209.B0905;

import java.util.Scanner;

public class Boj1267 {
    public static void main(String[] args) {
        int n, x, v1 = 0, v2 = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            v1 += (x / 30 + 1) * 10;
            v2 += (x / 60 + 1) * 15;
        }

        if(v1 > v2) {
            System.out.println("M " + v2);
        }
        else if(v1 < v2){
            System.out.println("Y " + v1);
        }
        else
            System.out.println("Y M " + v1);
    }
}
