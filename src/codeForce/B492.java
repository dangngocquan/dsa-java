package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve B492 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/492/B" > here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:42:00 PM -  Mar 17, 2022
 */
public class B492 {
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
		int l = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		Arrays.sort(a);
		double res = Math.max(a[0], l - a[n-1]);
		for (int i = 1; i < n; i++) {
			double x = (a[i] - a[i-1])*1.0/2;
			res = Math.max(res, x);
		}
		//Output
		System.out.println(res);
	}
}
