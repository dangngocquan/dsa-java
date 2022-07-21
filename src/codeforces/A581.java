package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A581 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/581/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:11:48 PM -  Mar 17, 2022
 */
public class A581 {
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
		scanner.close();
		//Solve
		int res1 = Math.min(a, b);
		int res2 = Math.abs(a-b)/2;
		//Output
		System.out.print(res1 + " ");
		System.out.println(res2);
	}
}
