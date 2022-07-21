package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A707 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/707/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:00:52 PM -  Mar 18, 2022
 */
public class A707 {
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
		int m = scanner.nextInt();
		String res = "#Black&White";
		for (int i = 0; i < n*m; i++) {
			String x = scanner.next();
			if (x.equals("C") || x.equals("M") || x.equals("Y")) res = "#Color";
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
