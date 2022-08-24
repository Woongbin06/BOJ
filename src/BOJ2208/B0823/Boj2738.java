import java.util.Scanner;

public class Boj2738 {
    public static void main(String[] args) {
        int[][] x = new int[100][100];
        int[][] y = new int[100][100];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i= 0; i < n; i++)
            for(int j = 0; j < m; j++)
                x[i][j] = sc.nextInt();

        for(int i= 0; i < n; i++)
            for(int j = 0; j < m; j++)
                y[i][j] = sc.nextInt();

        for(int i= 0; i < n; i++, System.out.println(""))
            for(int j = 0; j < m; j++)
                System.out.print(x[i][j] + y[i][j] + " ");
    }
}
