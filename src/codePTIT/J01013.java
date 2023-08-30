package codePTIT;

import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        long[] sums = new long[2000001];
        for (int i = 2; i < 2000001; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    sums[i] = sums[j] + sums[i/j];
                    break;
                }
            }
            if (sums[i] == 0) sums[i] = i;
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ans = 0;
        while (n-- > 0) {
            int x = scanner.nextInt();
            if (x < 0) x = -x;
            ans += sums[x];
        }
        System.out.println(ans);
    }
}
