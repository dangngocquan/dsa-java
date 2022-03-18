package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B1399 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1399/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:46:56 PM -  Mar 18, 2022
 */
public class B1399 {
	/**
	 * 
	 * The main method - entry point of this app. 
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] res = new long[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int minA = Integer.MAX_VALUE;
			int minB = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				a[j] =scanner.nextInt();
				minA = Math.min(minA, a[j]);
			}
			for (int j = 0; j < n; j++) {
				b[j] =scanner.nextInt();
				minB = Math.min(minB, b[j]);
			}
			for (int j = 0; j < n; j++) {
				res[i] += Math.max(a[j] - minA, b[j] - minB);
			}
		}
		scanner.close();
		//Output
		for (long i : res) {
			System.out.println(i);
		}
	}
}
