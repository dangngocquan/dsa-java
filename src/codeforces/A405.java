package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A405 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/405/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:24:11 PM -  Mar 17, 2022
 */
public class A405 {
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
		int[] a = new int[n];
		for (int i =0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		Arrays.sort(a);
		//Output
		for (int i: a) {
			System.out.print(i + " ");
		}
	}
}
