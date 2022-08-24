import java.util.Scanner;

public class Boj1934 {
    public static void main(String[] args) {
        int x, y, n, value1, value2;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
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
}