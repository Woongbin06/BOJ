import java.util.Scanner;

public class Boj2908 {
    public static void main(String[] args) {
        int x, y, value = 0, value2 = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0) {
            value = value * 10 + x % 10;
            x /= 10;
        }
        while (y != 0) {
            value2 = value2 * 10 + y % 10;
            y /= 10;
        }

        System.out.println(value > value2 ? value : value2);
    }
}
