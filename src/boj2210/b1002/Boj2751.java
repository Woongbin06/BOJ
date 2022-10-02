package boj2210.b1002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Boj2751 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        int y;

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        y = sc.nextInt();

        for(int i = 0; i < y; i++)
            x.add(sc.nextInt());

        Collections.sort(x);

        for (int i : x) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
