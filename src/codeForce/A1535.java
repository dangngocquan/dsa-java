package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1535 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1535/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:21:51 PM -  Mar 18, 2022
 */
public class A1535 {
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
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			if (Math.max(a, b) > Math.min(c, d) && Math.min(a, b) < Math.max(c, d)) {
				res[i] = "YES";
			}else {
				res[i] = "NO";
			}
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
