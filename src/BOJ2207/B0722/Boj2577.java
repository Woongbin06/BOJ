import java.util.Scanner;

public class Boj2577 {
    public static void main(String[] args) {
        int x;
        int y[] = new int[10];

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt() * sc.nextInt() * sc.nextInt();

        while(x != 0) {
            y[x % 10] += 1;
            x /= 10;
        }

        for(int i = 0; i < 10; i++)
            System.out.println(y[i]);
    }
}
