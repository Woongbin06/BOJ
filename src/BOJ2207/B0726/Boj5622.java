import java.util.Scanner;

public class Boj5622 {
    public static void main(String[] args) {
        int sum = 0;
        String x;

        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) >= 'A' && x.charAt(i) <= 'C')
                sum += 3;
            else if(x.charAt(i) <= 'F')
                sum += 4;
            else if(x.charAt(i) <= 'I')
                sum += 5;
            else if(x.charAt(i) <= 'L')
                sum += 6;
            else if(x.charAt(i) <= 'O')
                sum += 7;
            else if(x.charAt(i) <= 'S')
                sum += 8;
            else if(x.charAt(i) <= 'V')
                sum += 9;
            else if(x.charAt(i) <= 'Z')
                sum += 10;
        }

        System.out.println(sum);
    }
}
