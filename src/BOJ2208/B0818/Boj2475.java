import java.util.Scanner;

public class Boj2475 {
    public static void main(String[] args) {
        int x, value = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            x = sc.nextInt();
            value += x * x;
        }
        System.out.println(value % 10);
    }
}
