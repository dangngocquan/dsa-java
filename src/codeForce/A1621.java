package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1621/A"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 9:11:33 PM -  Apr 7, 2022
 */
public class A1621 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int maxRooks = (n+1)/2;
			if (k > maxRooks) {
				System.out.println(-1);
				continue;
			}
			for (int row = 1; row <= n; row++) {
				for (int column = 1; column <= n; column++) {
					if (k > 0 && row % 2 == 1 && column == row) {
						System.out.print("R");
						k--;
					}else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
