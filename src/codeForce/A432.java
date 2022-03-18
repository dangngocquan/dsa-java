package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A432 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/432/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:06:06 PM -  Mar 18, 2022
 */
public class A432 {
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
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (scanner.nextInt()<=5-k) count++;
		}
		scanner.close();
		//Output
		System.out.println(count/3);
	}
}
