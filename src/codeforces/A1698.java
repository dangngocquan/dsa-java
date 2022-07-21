package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1698/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:41:40 PM -  Jul 16, 2022
 */
public class A1698 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			a[0] = scanner.nextInt();
			int xor = a[0];
			for (int i = 1; i < n; i++) {
				a[i] = scanner.nextInt();
				xor ^= a[i];
			}
			for (int i = 0; i < n; i++) {
				if (a[i] == (xor ^ a[i])) {
					System.out.println(a[i]);
					break;
				}
			}
		}
		scanner.close();
	}
}
