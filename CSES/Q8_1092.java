import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8_1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long sum = 0;
        List<Long> set1 = new ArrayList<>();
        List<Long> set2 = new ArrayList<>();
        sum = (n * (n + 1)) / 2;
        if (sum % 2 == 0) {
            System.out.println("YES");
            long mid = sum / 2;

            for (long i = n; i >= 1; i--) {
                if (i <= mid) {
                    set1.add(i);
                    mid = mid - i;
                } else {
                    set2.add(i);
                }
            }

            System.out.println(set1.size());
            for (long i : set1) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println(set2.size());
            for (long i : set2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("NO");
        }
    }
}
/*Name : Harsh Raj , Reg : 2241018020 , Link : https://cses.fi/problemset/task/1092 */