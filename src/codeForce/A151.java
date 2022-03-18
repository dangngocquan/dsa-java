package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A151 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/151/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:32:23 PM -  Mar 18, 2022
 */
public class A151 {
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
		int k = scanner.nextInt();
		int l = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int p = scanner.nextInt();
		int nl = scanner.nextInt();
		int np = scanner.nextInt();
		scanner.close();
		//Solve
		int res = (Math.min(Math.min(k*l/nl, c*d), p/np))/n;
		//Output
		System.out.println(res);
	}
}
