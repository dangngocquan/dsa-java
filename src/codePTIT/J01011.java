package codePTIT;

import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long gcd = gcd(a, b);
            long lcm = a*b / gcd;
            System.out.println(lcm + " " + gcd);
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
