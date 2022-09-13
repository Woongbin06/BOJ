package BOJ2209.B0913;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj1292 {
    public static void main(String[] args) {
        int x, y, cnt = 0, sum = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        for(int i = 1; i <= y; i++){
            for(int n = 0; n < i; n++){
                a.add(i);
                cnt++;
            }
            if(cnt >= y)
                break;
        }
        for(int i = x - 1; i < y; i++) {
            sum += a.get(i);
        }

        System.out.println(sum);
    }
}
