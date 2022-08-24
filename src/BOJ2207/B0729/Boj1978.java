import java.util.Scanner;

public class Boj1978 {
    public static void main(String[] args) {
        int x, y, cnt = 0, cnt2 = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i = 0; i < x; i++) {
            cnt = 0;
            y = sc.nextInt();
            for(int n = 2; n <= y; n++) {
                if(y % n == 0)
                    cnt++;
            }
            if(cnt == 1)
                cnt2++;
        }
        System.out.println(cnt2);
    }
}
