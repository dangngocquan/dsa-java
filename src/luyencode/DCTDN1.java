package luyencode;

import java.util.Arrays;
import java.util.Scanner;

public class DCTDN1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) a[i] = scanner.nextLong();
		scanner.close();
		long[] dp = new long[n];
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}
}
