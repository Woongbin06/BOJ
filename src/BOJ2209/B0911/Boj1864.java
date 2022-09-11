package BOJ2209.B0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1864 {
    public static void main(String[] args) throws IOException {
        String x;
        char[] y = new char[]{'-', '\\', '(', '@', '?', '>', '&', '%'};
        int sum = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            x = bf.readLine();
            sum = 0;
            if(x.charAt(0) == '#')
                return;
            for(int i = 0; i < x.length(); i++) {
                int pow = (int) Math.pow(8, x.length() - 1 - i);
                for (int n = 0; n < 8; n++)
                    if (x.charAt(i) == y[n])
                        sum += n * pow;

                if (x.charAt(i) == '/')
                    sum += -1 * pow;
            }
            System.out.println(sum);
        }

    }
}
