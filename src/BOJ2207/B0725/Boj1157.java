import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Boj1157 {
    public static void main(String[] args) {
        String x;
        int[] y = new int[26];
        int max = -1;
        char out = ' ';

        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();

        for(int i = 0; i < 26; i++)
            y[i] = 0;

        for(int i = 0; i < x.length(); i++) {
            if (x.charAt(i) >= 65 && x.charAt(i) <= 90)
                y[x.charAt(i) - 65]++;
            else
                y[x.charAt(i) - 97]++;
        }

        for(int i = 0; i < 26; i++) {
            if(y[i] > max) {
                max = y[i];
                out = (char)(i + 65);
            }
            else if(y[i] == max)
                out = '?';
        }

        System.out.println(out);
    }
}
