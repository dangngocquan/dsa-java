package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1364/A"> link </a>
 * @author Bris
 * @version 1.0
 * @since 4:58:19 PM -  May 2, 2022
 */
public class A1364 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int[] a = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				sum += a[i];
			}
			
			int ans = -1;
			int tempSum = 0;
			for (int i = 0; i < n; i++) {
				tempSum += a[i];
				if (tempSum % x != 0) {
					ans = Math.max(ans, i + 1);
				}
				if ((sum - (tempSum - a[i])) % x != 0) {
					ans = Math.max(ans, n - i);
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
