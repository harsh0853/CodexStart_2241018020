import java.util.Scanner;

public class LongRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String s = sc.next();
        int n = s.length();
        int max = Integer.MIN_VALUE;
        for(int i = 1 ; i < n ; i++){
            if(s.charAt(i)==s.charAt(i-1)) {
                count++;
                max = Math.max(count , max);
            }
            else
                count=1;
        }
        System.out.println(Math.max(max , count));
    }
}
