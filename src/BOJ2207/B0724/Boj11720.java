import java.util.Scanner;

public class Boj11720 {
    public static void main(String[] args) {
        int x, sum = 0;
        String y;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.next();

        for(int i = 0; i < x; i++)
            sum += y.charAt(i) - '0';

        System.out.println(sum);
    }
}
