package BOJ2209.b0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1929 {
    public static void main(String[] args) throws IOException {
        int x, y, cnt;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        for(int i = x; i <= y; i++) {
            cnt = 0;
            for(int n = 2; n * n <=  i; n++) {
                if(i % n == 0)
                    cnt++;
            }
            if(cnt == 0 && i != 1)
                System.out.println(i);
        }
    }
}
