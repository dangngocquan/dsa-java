package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A69 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/69/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:31:10 PM Mar 17, 2022
 */
public class A69 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			c[i] = scanner.nextInt();
		}
		scanner.close();
		
		String res = "YES";
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += a[i];
			sum2 += b[i];
			sum3 += c[i];
		}
		if (sum1 != 0 || sum2 != 0 || sum3 != 0) {
			res = "NO";
		}
		
		System.out.println(res);
	}
}
