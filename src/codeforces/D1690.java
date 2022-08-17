package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1690/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 7:30:06 PM -  Aug 17, 2022
 */
public class D1690 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] dp = new int[n+1];
			String s = scanner.next();
			for (int i = 0; i < n; i++) {
				dp[i+1] += dp[i];
				if (s.charAt(i) == 'W') {
					dp[i+1]++;
				}
			}
			int ans = k;
			for (int i = k; i <= n; i++) {
				ans = Math.min(ans, dp[i] - dp[i-k]);
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
