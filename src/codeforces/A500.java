package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A500 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/500/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:12:40 PM -  Mar 18, 2022
 */
public class A500 {
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
		int t = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 1; i <= n-1; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve
		String res = "NO";
		int location = 1;
		while (location < n) {
			location += a[location];
			if (location == t) {
				res = "YES";
				break;
			}
		}
		//Output
		System.out.println(res);
	}
}
