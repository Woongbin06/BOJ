import java.util.Scanner;

public class Boj10809 {
    public static void main(String[] args) {
        int[] x = new int[26];
        String y;

        Scanner sc = new Scanner(System.in);
        y = sc.nextLine();

        for(int i = 0; i < 26; i++)
            x[i] = -1;

        for(int i = 0; i < y.length(); i++) {
            for(int n = 97; n <= 122; n++)
                if(y.charAt(i) == n && x[n - 97] == -1)
                    x[n - 97] = i;
        }

        for(int i = 0; i < 26; i++)
            System.out.print(x[i] + " ");
    }
}
