package boj2210.b1024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj2075 {
    public static void main(String[] args) throws IOException {
        int n, m = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(bf.readLine());
        int[] x = new int[n * n];
        for (int i = 0; i < n; i++) { // 이중포문으로 한 이유 -> 여러줄로 받아야 되는데
            // StringTokenizer를 한번만 선언하면 줄바꿈 했을 때 오류가 발생함. 그래서 한줄에 한번씩 선언.
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < n; j++) {
                x[m++] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(x);
        System.out.println(x[n * n - n]);
    }
}
