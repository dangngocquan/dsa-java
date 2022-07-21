package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1283 problem in codeforce.
 * The link ofthis problem is <a href = "https://codeforces.com/problemset/problem/1283/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:16:45 PM -  Mar 18, 2022
 */
public class A1283 {
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
			int h = scanner.nextInt();
			int m = scanner.nextInt();
			res[i] = 1440 - 60*h - m;
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
