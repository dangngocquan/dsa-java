package codeForce;

import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/problemset/problem/1333/A"> Link </a>
 * 
 * @author Bris
 * @version 1.0
 * @since 8:59:31 PM -  Mar 24, 2022
 */
public class A1333 {
	/**
	 * 
	 * The main method
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			System.out.print("W");
			for (int column = 1; column < m; column++) {
				System.out.print("B");
			}
			System.out.println();
			for (int row = 1; row < n; row++) {
				for (int column = 0; column < m; column++) {
					System.out.print("B");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
