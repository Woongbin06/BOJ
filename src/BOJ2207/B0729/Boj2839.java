import java.util.Scanner;

public class Boj2839 {
    public static void main(String[] args) {
        int x, cnt = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if(x / 5 == 0) {
            System.out.println("-1");
            return;
        }

        cnt += x / 5;
        for(int i = 0; i < cnt; i++)
            x -= 5;
        cnt += x / 3;
        int value = x / 3;
        for(int i = 0; i < value; i++)
            x -= 3;
        if(cnt == 0)
            System.out.println("-1");
        else if(x != 0)
            System.out.println(++cnt);
        else
            System.out.println(cnt);
    }
}
