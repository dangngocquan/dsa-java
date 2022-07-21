package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1697/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:47:53 PM -  Jul 14, 2022
 */
public class A1697 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int ans = 0;
			for (int i = 0; i < n; i++) {
				int x = scanner.nextInt();
				if (m >= x) {
					m -= x;
				}else {
					ans += x - m;
					m = 0;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
