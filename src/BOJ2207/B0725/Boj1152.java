import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj1152 {
    public static void main(String[] args) {
        String x;

        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        StringTokenizer token = new StringTokenizer(x, " ");

        System.out.println(token.countTokens()); // 마지막 단어 플러스
    }
}
