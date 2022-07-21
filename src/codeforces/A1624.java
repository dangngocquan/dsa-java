package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1624 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1624/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:18:25 PM -  Mar 18, 2022
 */
public class A1624 {
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
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int max = 0;
			int min = Integer.MAX_VALUE;
			for (int j = 1; j <= n; j++) {
				int x = scanner.nextInt();
				max = Math.max(max, x);
				min = Math.min(min, x);
			}
			res[i] = max - min;
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
