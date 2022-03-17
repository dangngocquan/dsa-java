package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A750 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/750/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:09:59 PM -  Mar 17, 2022
 */
public class A750 {
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
		scanner.close();
		//Solve
		int res = 0;
		if (k<=240) {
			res = (int)(Math.floor(Math.sqrt((480 + 1.25 - 2.0*k)/5) -1.0/2));
			if (res < 0) {
				res = 0;
			}
			if (res > n) res = n;
		}
		//Output
		System.out.println(res);
	}
}
