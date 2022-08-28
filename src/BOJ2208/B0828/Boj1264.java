package BOJ2208.B0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1264 {
    public static void main(String[] args) throws IOException {
        String x;
        int cnt = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            cnt = 0;
            x = bf.readLine();

            if(x.charAt(0) == '#')
                return;

            for(int i = 0; i < x.length(); i++) {
                switch (x.charAt(i)) {
                    case 'a' :
                    case 'e' :
                    case 'i' :
                    case 'o' :
                    case 'u' :
                    case 'A' :
                    case 'E' :
                    case 'I' :
                    case 'O' :
                    case 'U' :
                        cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
