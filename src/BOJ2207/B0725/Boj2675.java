import java.util.Scanner;

public class Boj2675 {
    public static void main(String[] args) {
        String x;
        int y, z;

        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        for(int i = 0; i < y; i++, System.out.println()) {
            z = sc.nextInt();
            x = sc.next();

            for(int n = 0; n < x.length(); n++)
                for(int j = 0; j < z; j++)
                    System.out.print(x.charAt(n));
        }
    }
}
