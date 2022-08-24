import java.util.Scanner;

public class Boj2902 {
    public static void main(String[] args) {
        String x, y = "";

        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        for(int i = 0; i < x.length(); i++)
            if(x.charAt(i) >= 65 && x.charAt(i) <= 90)
                y += x.charAt(i);
        System.out.println(y);
    }
}
