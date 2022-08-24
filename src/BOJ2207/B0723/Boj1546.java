import java.util.Scanner;

public class Boj1546 {
    public static void main(String[] args) {
        int x, max;
        double sum = 0;
        int[] y = new int[1000];

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        y[0] = sc.nextInt();
        max = y[0];
        for(int i = 1; i < x; i++) {
            y[i] = sc.nextInt();
            if(max < y[i])
                max = y[i];
        }
        for(int i = 0; i < x; i++)
                sum += y[i];

        System.out.println((sum / max * 100) / x);
    }
}
