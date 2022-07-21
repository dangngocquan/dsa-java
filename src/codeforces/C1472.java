package codeforces;

import java.util.Scanner;

public class C1472 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
			long max = Long.MIN_VALUE;
			long[] dp = new long[n];
			for (int i = n-1; i >= 0; i--) {
				if (i+a[i] >= n) {
					dp[i] = a[i];
				}else {
					dp[i] = a[i] + dp[i+a[i]];
				}
				max = Math.max(max, dp[i]);
			}
			System.out.println(max);
		}
		scanner.close();
	}
}
