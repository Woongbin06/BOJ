package BOJ2209.b0914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1427 {
    static int[] x = new int[10000];
    public static void main(String[] args) throws IOException {
        long y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        y = Long.parseLong(bf.readLine());
        long n = y / 10;

        for (int i = 0; i < n; i++){
            x[i] = (int) (y % 10);
            y /= 10;
        }

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x.length; j++){
                if(x[j] > x[i]){
                    int swap = x[j];
                    x[j] = x[i];
                    x[i] = swap;
                }

            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(x[i]);
    }
}
