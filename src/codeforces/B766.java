package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/766/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:13:12 PM -  Apr 3, 2022
 */
public class B766 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		Arrays.sort(a);
		String ans = "NO";
		for (int i = 2; i < n; i++) {
			if (a[i-2] + a[i-1] > a[i]) {
				ans = "YES";
				break;
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
