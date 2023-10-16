import java.io.*;
import java.util.*;

public class toh {

    public static void solve(int a, int b, int c, int n) {
        if (n == 0) {
            return;
        }
        solve(a, c, b, n - 1);
        System.out.println(a + " " + c);
        solve(b, a, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println((1L << n) - 1);

        solve(1, 2, 3, n);
    }
}
/*Name : Harsh Raj , Reg : 2241018020 , Link : https://cses.fi/problemset/task/2165 */