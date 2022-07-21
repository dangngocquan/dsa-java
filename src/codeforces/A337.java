package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A337 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/337/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:41:47 PM -  Mar 17, 2022
 */
public class A337 {
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
		int m = scanner.nextInt();
		int[] f = new int[m];
		for (int i = 0; i <  m; i++) {
			f[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		Arrays.sort(f);
		int res = f[n-1] - f[0];
		for (int i = n-1; i <m; i++) {
			res = Math.min(res, f[i] - f[i-n+1]);
		}
		//Output
		System.out.println(res);
	}
}
