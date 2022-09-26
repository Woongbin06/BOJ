package BOJ2209.b0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1551 {
    public static void main(String[] args) throws IOException {
        int n, m;
        String y;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine(), ",");

        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                x[j] = x[j + 1] - x[j];
            }
        }

        for (int i = 0; i < x.length - m - 1; i++) {
            System.out.print(x[i] + ",");
        }
        System.out.println(x[x.length - m - 1]);
    }
}
