import java.util.Scanner;

public class WeirdAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(n!=1){
            System.out.print(n + " ");
            if((n&1)==0)
                n/=2;
            else
                n= n*3 +1;
        }
        System.out.println(1);
    }
}
/*Name : Harsh Raj , Reg : 2241018020 , Link : https://cses.fi/problemset/task/1068 */