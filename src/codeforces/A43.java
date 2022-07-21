package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A43 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/43/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:29:18 PM -  Mar 18, 2022
 */
public class A43 {
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
		String A = scanner.next();
		int countA = 1;
		String B = "";
		int countB = 0;
		for (int i = 1; i <= n-1; i++) {
			String x = scanner.next();
			if (x.equals(A)) {
				countA++;
			}else {
				B = x;
				countB++;
			}
		}
		scanner.close();
		//Output
		if (countA > countB) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}
}
