import java.util.Scanner;

public class Boj3003 {
    public static void main(String[] args) {
        int[] x = new int[6];
        int[] y = {1, 1, 2, 2, 2, 8};

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++)
            x[i] = sc.nextInt();

        for(int i = 0; i < 6; i++) {
            System.out.print(y[i] - x[i] + " ");
        }
    }
}