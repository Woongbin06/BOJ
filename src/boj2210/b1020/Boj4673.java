package boj2210.b1020;

public class Boj4673 {
    static int[] x = new int[10001];

    public static void main(String[] args) {
        int sum, num;

        for (int i = 1; i < 10001; i++) {
            num = i;
            sum = num;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum <= 10000)
                x[sum] = 1;
        }

        for (int i = 1; i < 10001; i++) {
            if(x[i] == 0)
                System.out.println(i);
        }
    }
}
