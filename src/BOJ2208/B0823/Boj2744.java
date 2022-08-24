import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Boj2744 {
    public static void main(String[] args) throws IOException {
        String x;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = bf.readLine();

        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
                System.out.print((char)(x.charAt(i) - 32));
            else
                System.out.print((char)(x.charAt(i) + 32));
        }
    }
}
