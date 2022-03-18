package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve C1433 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1433/C"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 7:02:45 PM -  Mar 18, 2022
 */
public class C1433 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int ans = -1;
			int maxValue = Integer.MIN_VALUE;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				if (a[i] >maxValue) {
					maxValue = a[i];
				}
			}
			
			for (int i = 1; i < n-1; i++) {
				if (a[i] == maxValue && (a[i-1] < maxValue || a[i+1] < maxValue)) {
					ans = i+1;
					break;
				}
			}
			
			if (a[0] == maxValue && a[1] < maxValue) {
				ans = 1;
			}
			if (a[n-1] == maxValue && a[n-2] < maxValue) {
				ans = n;
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
