package BOJ2208.B0824;

import java.util.Scanner;

public class Boj4101 {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);

        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            if(x == 0 && y == 0)
                return;

            System.out.println(x > y ? "Yes" : "No");
        }
    }
}
