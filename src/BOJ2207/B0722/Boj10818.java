import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Boj10818 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        int y, min = 0, max = 0;

        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        for(int i = 0; i < y; i++) {
            x.add(sc.nextInt());
        }
        min = x.get(0);
        max = x.get(0);
        for(int i = 0; i < y; i++) {
            if(min > x.get(i))
                min = x.get(i);

            if(max < x.get(i))
                max = x.get(i);
        }

        System.out.println(min + " " + max);
    }
}
