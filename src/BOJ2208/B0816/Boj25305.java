import java.util.Scanner;

public class Boj25305 {
    public static void main(String[] args) {
        int[] x = new int[1000];
        int n, y;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        y = sc.nextInt();

        for(int i = 0; i < n; i++)
            x[i] = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(x[i] < x[j]) {
                    int swap = x[i];
                    x[i] = x[j];
                    x[j] = swap;
                }
            }
        }

        System.out.println(x[y - 1]);
    }
}
