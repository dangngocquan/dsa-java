package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A758 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/758/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:07:44 PM -  Mar 18, 2022
 */
public class A758 {
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
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		Arrays.sort(a);
		int res = 0;
		for (int i : a) {
			res += a[n-1] - i;
		}
		//Output
		System.out.println(res);
	}
}
