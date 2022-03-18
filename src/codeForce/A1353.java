package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1353 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1353/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:59:07 PM -  Mar 18, 2022
 */
public class A1353 {
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
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n==1) {
				res[i] = 0;
			}else if (n == 2) {
				res[i] = m;
			}else {
				res[i] = 2*m;
			}
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
