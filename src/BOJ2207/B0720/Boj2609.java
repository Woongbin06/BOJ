import java.util.Scanner;

public class Boj2609 {
    public static void main(String[] args) {
        int x, y, n, value1, value2;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        value1 = x;
        value2 = y;

        n = Math.max(x, y);
        for(int i = n; i >= 1; i--)
            if(x % i == 0 && y % i == 0) {
                System.out.println(i);
                break;
            }

        while(value1 != value2) {
            if(value1 > value2)
                value2 += y;
            else
                value1 += x;
        }
        System.out.println(value1);
    }
}
