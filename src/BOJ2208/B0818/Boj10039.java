import java.util.Scanner;

public class Boj10039 {
    public static void main(String[] args) {
        int avg= 0, x;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
           x = sc.nextInt();
           if(x < 40)
               avg +=  40;
           else
               avg += x;
        }
        System.out.println(avg / 5);
    }
}