package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A318 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/318/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:49:17 PM -  Mar 17, 2022
 */
public class A318 {
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
		long k = scanner.nextLong();
		scanner.close();
		//Solve
		//res - the number that will stand at the position number k after Volodya's manipulations.
		long res = 0;
		if (k>(n+1)/2) {
			res = (long)(2*(k-(n+1)/2));
		}else {
			res = (long)(2*k -1);
		}
		//Output
		System.out.println(res);
	}
}
