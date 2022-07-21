package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/732/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 4:55:29 PM -  May 28, 2022
 */
public class B732 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		int ans = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] + a[i-1] < k) {
				ans += k - (a[i] + a[i-1]);
				a[i] += k - (a[i] + a[i-1]);
			}
		}
		
		System.out.println(ans);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
