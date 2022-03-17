package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1030 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1030/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:46:47 PM -  Mar 17, 2022
 */
public class A1030 {
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
		
		//res - the answer
		String res = "EASY";
		for (int i = 0; i < n; i++) {
			if (scanner.nextInt() == 1) res = "HARD";
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
