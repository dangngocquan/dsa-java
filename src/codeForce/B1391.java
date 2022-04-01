package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1391/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:01:17 PM -  Apr 1, 2022
 */
public class B1391 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int ans = 0;
			for (int row = 0; row < n-1; row++) {
				if (scanner.next().charAt(m-1) == 'R') {
					ans++;
				}
			}
			String s = scanner.next();
			for (int i = 0; i < m-1; i++) {
				if (s.charAt(i) == 'D') {
					ans++;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
