package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A546 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/546/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:42:28 PM -  Mar 17, 2022
 */
public class A546 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int w = scanner.nextInt();
		scanner.close();
		
		//res - the amount of dollars that the soldier must borrow from his friend
		long res = (long)(k*w*(w+1)/2 - n);
		if (res < 0) res = 0;
		
		System.out.println(res);
	}
}
