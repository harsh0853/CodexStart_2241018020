import java.util.Scanner;

public class Q5_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2 || n==3)
            System.out.println("NO SOLUTION");
        else{
            int num=2;
            while( num <= n){
                System.out.print(num + " ");
                num+=2;
            }
            int num2 = 1;
            while( num2 <= n){
                System.out.print(num2 + " ");
                num2+=2;
            }
            System.out.println();
        }
    }
}
/*Name : Harsh Raj , Reg : 2241018020 , Link : https://cses.fi/problemset/task/1070 */