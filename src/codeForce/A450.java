package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/450/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 5:15:55 PM -  Apr 17, 2022
 */
public class A450 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		int max = 0;
		int indexOfmax = -1;
		for (int i = 0; i < n; i++) {
			a[i] = (scanner.nextInt()+m-1)/m;
			if (max <= a[i]) {
				max = a[i];
				indexOfmax = i+1;
			}
		}
		scanner.close();
		System.out.println((max > 1)? indexOfmax : n);
	}
}
