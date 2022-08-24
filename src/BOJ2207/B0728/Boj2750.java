import java.util.Scanner;

public class Boj2750 {
    public static void main(String[] args) {
        int[] x = new int[1000];
        int y, swap;

        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        for(int i = 0; i < y; i++)
            x[i] = sc.nextInt();

        for(int i = 0; i < y; i++) {
            for(int n = 0; n < y; n++) {
                if(x[i] < x[n]) {
                   swap = x[i];
                   x[i] = x[n];
                   x[n] = swap;
                }
            }
        }

        for(int i = 0; i < y; i++)
            System.out.println(x[i]);
    }
}
