package BOJ2209.B0904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11365 {
    public static void main(String[] args) throws IOException {
        String x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb;

        while(true) {
            x = bf.readLine();
            if(x.equals("END"))
                break;
            sb = new StringBuffer(x);
            System.out.println(sb.reverse());
        }
    }
}
