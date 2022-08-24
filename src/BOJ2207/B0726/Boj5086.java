import java.util.Scanner;

public class Boj5086 {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);

        while(true) {
            x = sc.nextInt();
            y = sc.nextInt();

            if(x > y) {
                if(x % y == 0)
                    System.out.println("multiple");
                else
                    System.out.println("neither");
            }
            else if(x < y) {
                if(y % x == 0)
                    System.out.println("factor");
                else
                    System.out.println("neither");
            }
            else
                break;
        }
    }
}
