import java.util.Scanner;

public class Q2_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for(int i = 0 ; i < n-1 ; i++)
            sum+=sc.nextLong();
        System.out.println((n&1)==0 ? (n/2)*(n+1) - sum : n*(n+1)/2 - sum);
    }
}
/*Name : Harsh Raj , Reg : 2241018020 , Link : https://cses.fi/problemset/task/1083 */