package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A723 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/723/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:52:06 PM -  Mar 18, 2022
 */
public class A723 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		//Solve
		int res= Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
		//Output
		System.out.println(res);
	}
}
