package BOJ2208.B0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5893 {
    public static void main(String[] args) throws IOException {
        int x, y, z;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bf.readLine());
        y = Integer.parseInt(bf.readLine());
        z = Integer.parseInt(bf.readLine());

        if(x == 60 && y == 60 && z == 60)
            System.out.println("Equilateral");
        else if(x + y + z == 180 && (x == y || x == z || z == y))
            System.out.println("Isosceles");
        else if(x + y + z == 180)
            System.out.println("Scalene");
        else
            System.out.println("Error");
    }
}
