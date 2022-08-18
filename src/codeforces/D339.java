package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/339/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 7:20:11 PM -  Aug 18, 2022
 */
public class D339 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long[] a = new long[(int)(Math.pow(2, n))];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextLong();
		}
		scanner.close();
	}
}
