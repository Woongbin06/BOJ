import java.util.Scanner;

public class Boj13241 {
    public static void main(String[] args) {
        long x, y, value1, value2;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        value1 = x;
        value2 = y;

        while(value1 != value2) {
            if(value1 > value2)
                value2 += y;
            else
                value1 += x;
        }
        System.out.println(value1);
    }
}
