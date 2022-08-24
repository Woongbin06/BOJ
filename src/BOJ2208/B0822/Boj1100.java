import java.util.Scanner;

public class Boj1100 {
    public static void main(String[] args) {
        int cnt = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 8; i++) {
            String x = sc.next();
            for(int n = 0; n < 8; n++)
                if(x.charAt(n) == 'F' && (n + i) % 2 == 0)
                    cnt++;
        }

        System.out.println(cnt);
    }
}
