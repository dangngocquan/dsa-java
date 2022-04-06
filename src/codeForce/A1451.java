package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1451/A"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 6:05:13 PM -  Apr 6, 2022
 */
public class A1451 {
	public static int count(int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		if (n == 3) {
			return 2;
		}
		return (n % 2 == 0)? 2 : 3;
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			System.out.println(count(n));
		}
		scanner.close();
	}
}
