package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/34/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 7:51:31 PM -  Jul 16, 2022
 */
public class A34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		int ans1 = 0;
		int ans2 = 0;
		int tempAbs = Integer.MAX_VALUE;
		for (int i = 0; i < n-1; i++) {
			if (Math.abs(a[i] - a[i+1]) <= tempAbs) {
				ans1 = i + 1;
				ans2 = i + 2;
				tempAbs = Math.abs(a[i] - a[i+1]);
			}
		}
		if (Math.abs(a[0] - a[n-1]) < tempAbs) {
			ans1 = n;
			ans2 = 1;
		}
		System.out.println(ans1 + " " + ans2);
	}
}
