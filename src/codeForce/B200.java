package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B200 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/200/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:05:05 PM -  Mar 17, 2022
 */
public class B200 {
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
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scanner.nextInt();
		}
		scanner.close();
		//Output
		System.out.println((double)(sum*1.0/n));
	}
}
