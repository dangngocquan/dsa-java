package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1360 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1360/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:44:02 PM -  Mar 18, 2022
 */
public class A1360 {
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
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int x = Math.max(a, b);
			int y = Math.min(a, b);
			if (x > 2*y) {
				res[i] = x*x;
			}else {
				res[i] = 4*y*y;
			}
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
