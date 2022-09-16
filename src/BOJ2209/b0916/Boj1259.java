package BOJ2209.b0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1259 {
    public static void main(String[] args) throws IOException {
        String x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            x = bf.readLine();
            if(x.charAt(0) == '0')
                return;

            StringBuffer sb = new StringBuffer(x);
            if((sb.reverse().toString()).equals(x))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
