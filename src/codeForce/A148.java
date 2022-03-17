package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A148 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/148/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:30:53 PM -  Mar 17, 2022
 */
public class A148 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();
		int d = scanner.nextInt();
		scanner.close();
		//Solve
		//res - the number of damaged dragons.
		int res = 0;
		for (int i = 1; i <= d; i++) {
			if (i%k==0 || i %n==0 || i %m == 0 || i % l == 0) res++;
		}
		//Output
		System.out.println(res);
	}
}
