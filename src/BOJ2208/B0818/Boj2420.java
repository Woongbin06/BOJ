import java.util.Scanner;

public class Boj2420 {
    public static void main(String[] args) {
        Long x, y;

        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        y = sc.nextLong();

        System.out.println(Math.abs(x - y));
    }
}
