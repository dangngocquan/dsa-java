package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1559/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:30:04 PM -  May 21, 2022
 */
public class A1559 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			int ans = a[0];
			for (int i = 0; i < n; i++) {
				ans &= a[i];
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}