import java.util.Scanner;

public class Boj2941 {
    public static void main(String[] args) {
        String x;
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();

        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == 'c' && i < x.length() - 1) {
                if((x.charAt(i + 1) == '=' || x.charAt(i + 1) == '-'))
                    i++;
            }
            else if(x.charAt(i) == 'd' && i < x.length() - 1) {
                if(x.charAt(i + 1) == 'z' && i < x.length() - 2) {
                    if(x.charAt(i + 2) == '=')
                        i+=2;
                }
                else if(x.charAt(i + 1) == '-')
                    i++;
            }
            else if(x.charAt(i) == 'l' && x.charAt(i + 1) == 'j' && i < x.length() - 1)
                i++;
            else if(x.charAt(i) == 'n' && x.charAt(i + 1) == 'j' && i < x.length() - 1)
                i++;
            else if(x.charAt(i) == 's' && x.charAt(i + 1) == '=' && i < x.length() - 1)
                i++;
            else if(x.charAt(i) == 'z' && x.charAt(i + 1) == '=' && i < x.length() - 1)
                i++;

            cnt++;
        }

        System.out.println(cnt);
    }
}
