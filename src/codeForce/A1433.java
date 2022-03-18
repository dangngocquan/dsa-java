package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1433 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1433/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:59:55 PM -  Mar 18, 2022
 */
public class A1433 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int x = scanner.nextInt();
			res[i] = 10*(x%10 - 1) + ((x+"").length())*((x+"").length()+1)/2;
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
