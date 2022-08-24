import java.util.Scanner;

public class Boj10872 {
    static int value = 1;

    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println(f(x));
    }
    public static int f(int n) {
        if(n <= 1)
            return value;
        else {
            value *= n;
            return f(n - 1);
        }
    }
}
