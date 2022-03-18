package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A935 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/935/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:31:07 PM -  Mar 18, 2022
 */
public class A935 {
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
		scanner.close();
		//Solve
		int res = 1;
		for (int i = 2; i <= n; i++) {
			int count = 0;
			while (n%i==0) {
				n /= i;
				count++;
			}
			res *= (count+1);
		}
		//Output
		System.out.println(res - 1);
	}
}
