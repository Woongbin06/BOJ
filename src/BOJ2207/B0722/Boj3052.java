import java.util.Scanner;

public class Boj3052 {
    public static void main(String[] args) {
        int x[] = new int[42];
        int y = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
            x[sc.nextInt() % 42] = 1;

        for(int i = 0; i < 42; i++)
            if(x[i] == 1)
                y++;

        System.out.println(y);
    }
}
