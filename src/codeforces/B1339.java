package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1339/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:03:55 AM -  Apr 12, 2022
 */
public class B1339 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			if (n % 2 != 0) {
				System.out.print(a[n/2] + " ");
			}
			for (int i = n/2 - 1; i >= 0; i--) {
				System.out.print(a[i] + " " + a[n-1-i] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
