package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A749 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/749/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:16:31 PM -  Mar 18, 2022
 */
public class A749 {
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
		scanner.close();
		//Output
		System.out.println(n/2);
		while (n> 3) {
			System.out.print("2 ");
			n -= 2;
		}
		System.out.println(n);
	}
}
