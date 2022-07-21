package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A189 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/189/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:43:11 AM -  Mar 18, 2022
 */
public class A189 {
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
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 1;
		for (int i = 0; i <= n/a; i++) {
			for (int j = 0; j <= (n-a*i)/b; j++) {
				int k = n - a*i - b*j;
				if (k%c==0) {
					res = Math.max(res, i+j+k/c);
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
