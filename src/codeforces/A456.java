package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A456 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/456/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:35:52 PM -  Mar 18, 2022
 */
public class A456 {
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
		int[] a = new int[100001];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			a[x] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		String res = "Poor Alex";
		for (int i = 1; i < n; i++) {
			if (a[i] > a[i+1]) {
				res = "Happy Alex";
				break;
			}
		}
		//Output
		System.out.println(res);
	}
}
