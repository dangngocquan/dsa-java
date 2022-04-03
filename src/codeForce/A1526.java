package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1526/A"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 3:32:55 PM -  Apr 2, 2022
 */
public class A1526 {
	/**
	 * The main method.
	 * @param args Unused.
	 *
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[2*n];
			for (int i = 0; i < 2*n; i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			int[] b = new int[2*n];
			for (int i = 0; i < n; i++) {
				b[i*2] = a[i];
				b[i*2+1] = a[i+n];
			}
			for (int i : b) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
