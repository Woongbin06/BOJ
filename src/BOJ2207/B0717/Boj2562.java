import java.util.Scanner;

public class Boj2562 {
    public static void main(String[] args) {
        int[] x = new int[9];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 9; i++)
            x[i] = sc.nextInt();
        int max = x[0];
        for(int i = 0; i < 9; i++)
            if(max < x[i])
                max = x[i];
        System.out.println(max);
        for(int i = 0; i < 9; i++)
            if(max == x[i])
                System.out.println(++i);
    }
}
