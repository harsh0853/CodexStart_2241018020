import java.util.Scanner;

public class TrailZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cur = 5;
        long ans = 0;
        while(cur <= n){
            ans+=n/cur;
            cur*=5;
        }
        System.out.println(ans);
    }
}
