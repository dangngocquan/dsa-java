package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1374 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1374/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:26:06 PM -  Mar 18, 2022
 */
public class A1374 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int n = scanner.nextInt();
			res[i] = (n/x)*x+y;
			if (res[i] > n) res[i] -= x;
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
