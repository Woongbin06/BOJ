import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1550 {
    public static void main(String[] args) throws IOException {
        String x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = bf.readLine();

        System.out.println(Integer.parseInt(x, 16));
    }
}
