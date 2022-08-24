import java.util.Scanner;

public class Boj11659 {
    public static void main(String[] args) {
        int[] x = new int[100000];
        int n, m, a, b, sum;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 1; i <= n; i++)
            x[i] = sc.nextInt();

        for(int i = 0; i < m; i++) {
            sum = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            for(int j = a; j <= b; j++){
                sum += x[j];
            }
            System.out.println(sum);
        }
    }
}
