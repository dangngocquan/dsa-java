package codePTIT;

import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        if (n <= 1 || n % 2 == 1) return 0;
        int ans = 0;
        int temp = 1;
        while (n % 2 == 0) {
            n /= 2;
            ans++;
        }
        double end = Math.sqrt(n);
        for (int i = 3; i <= end; i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            temp *= (count + 1);
            if (n == 1) break;
        }
        if (n > 1) temp *= 2;
        ans *= temp;
        return ans;
    }
}
