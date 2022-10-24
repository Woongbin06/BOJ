package boj2210.b1024;

import java.util.*;

public class Boj1822 {
    public static void main(String[] args) {
        Set<Integer> x = new TreeSet<Integer>();
        int n, m;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int y = sc.nextInt();
            if(x.contains(y))
                x.remove(y);
        }

        System.out.println(x.size());
        for (Integer i : x) {
            System.out.print(i + " ");
        }
    }
}
