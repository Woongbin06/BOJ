import java.util.Scanner;

public class Boj25304 {
    public static void main(String[] args) {
        int x, y, z, n, sum = 0;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            y = sc.nextInt();
            z = sc.nextInt();
            sum += y * z;
        }

        if(sum == x)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
