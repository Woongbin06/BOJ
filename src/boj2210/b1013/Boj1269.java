package boj2210.b1013;

import java.util.Scanner;

public class Boj1269 {
    static int[] arr1 = new int[200000];
    static int[] arr2 = new int[200000];
    static int[] arr3 = new int[200000];
    static int[] arr4 = new int[200000];

    public static void main(String[] args) {
        int x, y, cnt1 = 0, cnt2 = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int num = sc.nextInt();
            arr1[i] = num;
            arr3[i] = num;
        }
        for (int i = 0; i < y; i++) {
            int num = sc.nextInt();
            arr2[i] = num;
            arr4[i] = num;
        }

        for (int i = 0; i < x; i++)
            for (int n = 0; n < y; n++)
                if (arr1[i] == arr2[n]) {
                    arr1[i] = 0;
                    cnt1++;
                }
        int num1 = x - cnt1;

        for (int i = 0; i < x; i++)
            for (int n = 0; n < y; n++)
                if (arr4[i] == arr3[n] && arr3[n] != 0) {
                    arr4[i] = 0;
                    cnt2++;
                }
        int num2 = y - cnt2;

        System.out.println(num1 + num2);
    }
}
