package BOJ2209.B0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2460 {
    public static void main(String[] args) throws IOException {
        int[] x = new int[7];
        int min = 0, sum = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 7; i++)
            x[i] = Integer.parseInt(bf.readLine());

        min = x[0];

        for(int i = 1;i < 7; i++){
            if(x[i] % 2 == 1) {
                sum += x[i];
                if(min > x[i])
                    min = x[i];
            }
        }

        if(sum == 0)
            System.out.println("-1");
        else
            System.out.println(sum + "\n" + min);
    }
}
