package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A579 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/579/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:41:52 PM -  Mar 18, 2022
 */
public class A579 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		while (x>0) {
			if (x %2==1) {
				res ++;
			}
			x /=2;
		}
		//Output
		System.out.println(res);
	}
}
