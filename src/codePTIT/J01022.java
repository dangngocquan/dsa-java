package codePTIT;

import java.util.Scanner;

public class J01022 {
    static long[] length;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        length = new long[93];
        length[1] = 1;
        length[2] = 1;
        for (int i = 3; i < 93; i++) length[i] = length[i-1] + length[i-2];

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            System.out.println(getChar(n, k));
        }

    }

    public static char getChar(int n, long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';
        long length2 = length[n-2];
        if (k <= length2) {
            return getChar(n-2, k);
        } else {
            return getChar(n-1, k - length2);
        }
    }
}
