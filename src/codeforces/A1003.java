package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1003/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 7:59:14 PM -  Apr 15, 2022
 */
public class A1003 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] counter = new int[101];
		for (int i = 0; i < n; i++) {
			counter[scanner.nextInt()]++;
		}
		scanner.close();
		
		int ans = 0;
		for (int value : counter) {
			ans = Math.max(value, ans);
		}
		System.out.println(ans);
	}
}
