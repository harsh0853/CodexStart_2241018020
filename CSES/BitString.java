import java.util.Scanner;

public class BitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long MOD = 1000000007;
        long n = sc.nextLong();
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= 2;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}
