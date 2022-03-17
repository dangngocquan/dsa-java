package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A50 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/50/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:52:33 PM Mar 17, 2022
 */
public class A50 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		
		//res - the maximal number of dominoes, which can be placed.
		long res = 0;
		if (n*m%2==0) {
			res = (long)(n*m/2);
		}else {
			res = (long)(n*(m/2) + n/2);
		}
		
		System.out.println(res);
	}
}
