package codePTIT;

import java.util.Scanner;

public class J03035 {
    static long[] pow10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pow10 = new long[] {
                1, 10, 100, 1000, 10000, 100000, 1000000,
                10000000, 100000000, 1000000000};
        int t = scanner.nextInt();
        while (t-- > 0) {
            String a = scanner.next();
            String b = scanner.next();
            System.out.println(solve(a, b));
        }
    }

    public static long solve(String a, String b) {
        int n = a.length();
        int countBlank = 0;
        for (int i = 0; i < n; i++) {
            countBlank += (a.charAt(i) == '?')? 1 : 0;
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            char charA = a.charAt(i);
            char charB = b.charAt(i);
            if (charA == '?') {
                countBlank--;
                long value = '9' - charB;
                ans += value * pow10[countBlank];
            } else {
                if (charA < charB) return ans;
                if (charA > charB) {
                    ans += pow10[countBlank];
                    return ans;
                }
            }
        }
        return ans;
    }
}
