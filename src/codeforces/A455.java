package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A455 problem i codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/455/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:02:29 PM -  Mar 18, 2022
 */
public class A455 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[100001];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			a[x] += x;
		}
		scanner.close();
		//Solve
		for (int i = 2; i < 100001; i++) {
			a[i] = Math.max(a[i-1], a[i] + a[i-2]);
		}
		//Output
		System.out.println(a[100000]);
	}
}
