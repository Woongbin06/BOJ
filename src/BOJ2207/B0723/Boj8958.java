import java.util.Scanner;

public class Boj8958 {
    public static void main(String[] args) {
        int x, cnt = 1, sum;
        String value;

        Scanner sc = new Scanner(System.in);
        x = Integer.parseInt(sc.nextLine()); // 개행 문자 제거

        for(int i = 0; i < x; i++) {
            value = sc.nextLine();
            sum = 0;
            cnt = 1;
            for(int n = 0; n < value.length(); n++) {
                if(value.charAt(n) == 'O')
                    sum += cnt++;
                else if(value.charAt(n) == 'X')
                    cnt = 1;
            }
            System.out.println(sum);
        }
    }
}
