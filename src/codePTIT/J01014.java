package codePTIT;

import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder s = new StringBuilder("");
        while (t-- > 0) {
            long n = scanner.nextLong();
            s.append(largestPrimeDivisor(n)).append("\n");
        }
        System.out.println(s.toString());
        scanner.close();
    }

    public static long largestPrimeDivisor(long n) {
        long ans = 2;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                n /= i;
                ans = i;
            }
        }
        if (n > 1) ans = n;
        return ans;
    }
}
