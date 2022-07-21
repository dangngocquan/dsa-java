package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A486 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/486/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:54:32 PM -  Mar 17, 2022
 */
public class A486 {
	/**
	 * 
	 * The main method - entry point of this app. 
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve
		//res - is value of f(n)
		long res = 0;
		if (n%2 == 0 ) {
			res = n/2;
		}else {
			res = - (n+1)/2;
		}
		//Output
		System.out.println(res);
	}
}
