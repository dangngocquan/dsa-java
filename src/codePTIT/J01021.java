package codePTIT;

import java.util.Scanner;

public class J01021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = 0;
        long b = 0;
        StringBuilder sb = new StringBuilder("");
        do {
            a = scanner.nextLong();
            b = scanner.nextLong();
            if (a > 0 || b > 0) {
                sb.append(power(a, b)).append("\n");
            }
        } while (a > 0 || b > 0);
        System.out.println(sb.toString());
        scanner.close();
    }

    public static long power(long a, long b) {
        if (b == 0) return 1;
        if (a == 0) return 0;
        long temp;
        temp = power(a, b / 2);
        if (b % 2 == 0)
            return temp * temp % 1000000007;
        else
            return (a * temp) % 1000000007 * temp % 1000000007;
    }
}
