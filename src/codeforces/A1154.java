package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A1154 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1154/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:42:36 PM -  Mar 18, 2022
 */
public class A1154 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int[] x = new int[4];
		for (int i = 0; i < 4; i++) {
			x[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		Arrays.sort(x);
		//Output
		for (int i = 0; i < 3; i++) {
			System.out.print((x[3] - x[i]) + " ");
		}
	}
}
