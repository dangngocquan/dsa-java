package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1454 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1454/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:13:21 PM -  Mar 18, 2022
 */
public class A1454 {
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
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			for (int j=1; j <= n; j++) a[j] = n+1-j;
			if (n>2) {
				int k = n/2 + 1;
				a[k] += a[k+1];
				a[k+1] = a[k] - a[k+1];
				a[k] = a[k] - a[k+1];
			}
			res[i] = "";
			for (int j = 1; j <= n; j++) res[i] += a[j]+" ";
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
