package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1345/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:49:17 PM -  Apr 5, 2022
 */
public class B1345 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] dp = new int[25821];
		for (int i = 1; i < 25820; i++) {
			dp[i] = i*(3*i+1)/2;
		}
		dp[25820] = Integer.MAX_VALUE;
		while (t-->0) {
			int n = scanner.nextInt();
			int count = 0;
			while (n >= 2) {
				count++;
				for (int i = 1; i < 25821; i++) {
					if (n < dp[i]) {
						n -= dp[i-1];
						break;
					}
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}
}
