import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1929 {
    public static void main(String[] args) throws IOException {
        int x, y, cnt = 0, z;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        for(int i = x; i <= y; i++) {
            cnt = 0;
            for(int n = 2; n < i; n++) {
                if(i % n == 0)
                    cnt++;
            }
            if(cnt == 0)
                System.out.println(i);
        }
    }
}
