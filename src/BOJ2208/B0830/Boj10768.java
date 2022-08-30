package BOJ2208.B0830;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Boj10768 {
    public static void main(String[] args) throws IOException {
        int x, y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());
        y = Integer.parseInt(bf.readLine());

        if(x > 2)
            System.out.println("After");
        else if(x < 2)
            System.out.println("Before");
        else  {
            if (y > 18)
                System.out.println("After");
            else if(y < 18)
                System.out.println("Before");
            else
                System.out.println("Special");
        }
    }
}
