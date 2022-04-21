package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1627/A"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 6:46:11 PM -  Apr 20, 2022
 */
public class A1627 {
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
			int r = scanner.nextInt();
			int c = scanner.nextInt();
			char[][] grid = new char[n][m];
			for (int i = 0; i < n; i++) {
				grid[i] = scanner.next().toCharArray();
			}
			
			int ans = -1;
			if (grid[r-1][c-1] == 'B') {
				ans = 0;
				System.out.println(ans);
				continue;
			}
			
			for (int i = 0; i < m; i++) {
				if (grid[r-1][i] == 'B') {
					ans = 1;
				}
			}
			for (int i = 0; i < n; i++) {
				if (grid[i][c-1] == 'B') {
					ans = 1;
				}
			}
			if (ans == 1) {
				System.out.println(ans);
				continue;
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (grid[i][j] == 'B') {
						ans = 2;
					}
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
