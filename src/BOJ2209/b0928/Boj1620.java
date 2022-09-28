package BOJ2209.b0928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1620 {
    public static void main(String[] args) throws IOException {
        int n, m;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        String[] x = new String[n];

        for (int i = 0; i < n; i++) {
            x[i] = bf.readLine();
        }

        for (int i = 0; i < m; i++) {
            String y = bf.readLine();

            if (y.charAt(0) >= 65 && y.charAt(0) <= 122) {
                for (int j = 0; j < n; j++) {
                    if(y.equals(x[j])) {
                        System.out.println(j + 1);
                        break;
                    }
                }
            }
            else {
                int a = Integer.parseInt(y);
                System.out.println(x[a - 1]);
            }
        }
    }
}
