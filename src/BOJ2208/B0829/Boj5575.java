package BOJ2208.B0829;

import java.util.Scanner;

public class Boj5575 {
    public static void main(String[] args) {
        int[] x= new int[6];
        int hour, min, sec;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for(int n = 0; n < 6; n++) {
                x[n] = sc.nextInt();
            }
            sec = x[5] - x[2];
            if(sec < 0) {
                sec += 60;
                x[4]--;
            }
            min = x[4] - x[1];
            if(min < 0) {
                min += 60;
                x[3]--;
            }
            hour = x[3] - x[0];
            System.out.println(hour + " " + min + " " + sec);
        }
    }
}
