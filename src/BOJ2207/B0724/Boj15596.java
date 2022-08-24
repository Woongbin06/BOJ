public class Boj15596 {
    public static void main(String[] args) {
        Test test = new Test();
        int[] x = {1, 2, 4, 5, 6};

        test.sum(x);
    }

    static class Test {
        long sum(int[] a) {
            long sum = 0;

            for(int i = 0; i < a.length; i++) {
                sum += a[i];
            }

            return sum;
        }
    }
}
