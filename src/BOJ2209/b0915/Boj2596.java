package BOJ2209.b0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2596 {
    public static void main(String[] args) throws IOException {
        String x;
        String[] result = new String[11];
        int y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        y = Integer.parseInt(bf.readLine());
        x = bf.readLine();

        for(int i = 0; i < y; i++) {
            result[i] = x.substring(i * 6, ((i + 1) * 6));
        }
        for (int i = 0; i < y; i++){
            if(result[i].contains("000000"))
                System.out.print("A");
            else if(result[i].contains("001111"))
                System.out.print("B");
            else if(result[i].contains("010011"))
                System.out.print("C");
            else if(result[i].contains("011100"))
                System.out.print("D");
            else if(result[i].contains("101001"))
                System.out.print("E");
            else if(result[i].contains("100110"))
                System.out.print("F");
            else if(result[i].contains("110101"))
                System.out.print("G");
            else if(result[i].contains("111010"))
                System.out.print("H");
            else {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
