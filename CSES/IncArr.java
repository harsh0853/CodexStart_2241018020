import java.util.Scanner;

public class IncArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                ans += (arr[i - 1] - arr[i]);
                arr[i] = arr[i - 1];
            }
        }

        System.out.println(ans);
    }
}
