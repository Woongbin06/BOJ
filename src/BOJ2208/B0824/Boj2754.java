package BOJ2208.B0824;

import java.io.IOException;
import java.util.Scanner;

public class Boj2754 {
    public static void main(String[] args) throws IOException {
        String x;
        double value = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();

        if(x.charAt(0) == 'A')
            value += 4;
        else if(x.charAt(0) == 'B')
            value += 3;
        else if(x.charAt(0) == 'C')
            value += 2;
        else if(x.charAt(0) == 'D')
            value += 1;
        else if(x.charAt(0) == 'E') {
            System.out.println(0.0);
            return;
        }

        if(x.charAt(1) == '+')
            value += 0.3;
        else if(x.charAt(1) == '0')
            value += 0.0;
        else if(x.charAt(1) == '-')
            value -= 0.3;

        System.out.println(value);
    }
}
