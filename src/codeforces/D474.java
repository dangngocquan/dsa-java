package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/474/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:55:23 PM -  Aug 16, 2022
 */
public class D474 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int k = scanner.nextInt();
		int[] dp = new int[100001];
		for (int i = 0; i < 100001; i++) {
			if (i < k) {
				dp[i] = 1; // R, RR, ...
			}else {
				dp[i] = (dp[i-1] + dp[i-k]) % 1000000007;
				// + dp[i-1] : Thêm 'R' vào cuối các cách ăn của dp[i-1]
				// + dp[i-k]: The m k kí tự 'W' vào cuối các cách ăn của dp[i-k]
			}
		}
		for (int i = 1; i < 100001; i++) {
			dp[i] = (dp[i] + dp[i-1]) % 1000000007;
		}
		
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println((dp[b] - dp[a-1] + 1000000007) % 1000000007);
		}
		scanner.close();
	}
}
