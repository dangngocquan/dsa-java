package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1355/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:36:50 AM -  May 10, 2022
 */
public class B1355 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] countInExp = new int[n+1];
			for (int i = 0; i < n; i++) {
				countInExp[scanner.nextInt()]++;
			}
			
			int ans = 0;
			int tempCount = 0;
			for (int i = 1; i <= n; i++) {
				ans += (tempCount + countInExp[i]) / i;
				tempCount = (tempCount + countInExp[i]) % i;
			}
			
			System.out.println(ans);
		}
		scanner.close();
	}
}
