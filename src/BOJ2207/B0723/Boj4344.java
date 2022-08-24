import java.util.Scanner;

public class Boj4344 {
    public static void main(String[] args) {
        int x, y, sum, avg;
        int[] value = new int[1000];
        float cnt;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i = 0; i < x; i++) {
            y = sc.nextInt();
            sum = 0; avg = 0; cnt = 0;

            for(int n = 0; n < y; n++) {
                value[n] = sc.nextInt();
                sum += value[n];
            }
            avg = sum / y;
            for(int n = 0; n < y; n++) {
                if(value[n] > avg)
                    cnt++;
            }
            System.out.printf("%.3f%%\n", cnt / y * 100);
        }
    }
}
