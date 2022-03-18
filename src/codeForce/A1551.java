package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1551 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1551/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:41:12 PM -  Mar 18, 2022
 */
public class A1551 {
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
		int[] res1 = new int[t];
		int[] res2 = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			if (n%3==0) {
				res1[i] = n/3;
				res2[i] = n/3;
			}else if (n%3 == 1) {
				res1[i] = n/3 + 1;
				res2[i] = n/3;
			}else {
				res1[i] = n/3;
				res2[i] = n/3+1;
			}
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i ++) {
			System.out.println(res1[i] + " " + res2[i]);
		}
	}
}
