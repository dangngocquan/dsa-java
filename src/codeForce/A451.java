package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A451 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/451/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:02:21 PM -  Mar 17, 2022
 */
public class A451 {
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
		scanner.close();
		//Solve
		int res = Math.min(n, m);
		//Output
		if (res %2 == 0) {
			System.out.println("Malvika");
		}else {
			System.out.println("Akshat");
		}
	}
}
