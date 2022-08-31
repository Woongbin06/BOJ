package BOJ2208.B0831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1076 {
    public static void main(String[] args) throws IOException {
        String x, y, z;
        final String[] a = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long value = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = bf.readLine();
        y = bf.readLine();
        z = bf.readLine();

        for(int i = 0; i < 10; i++) {
            if(x.equals(a[i])) {
                value += i * 10;
                break;
            }
        }
        for(int i = 0; i < 10; i++) {
            if(y.equals(a[i])) {
                value += i;
                break;
            }
        }
        for(int i = 0; i < 10; i++) {
            if(z.equals(a[i])) {
                value *= Math.pow(10, i);
                break;
            }
        }

        System.out.println(value);
    }
}
