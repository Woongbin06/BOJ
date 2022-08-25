package BOJ2208.B0825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLSyntaxErrorException;

public class Boj9086 {
    public static void main(String[] args) throws IOException {
        int x;
        String y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());

        for (int i = 0; i < x; i++) {
            y = bf.readLine();
            int last = y.length() - 1;
            System.out.println(y.charAt(0) + "" + y.charAt(last));
        }
    }
}