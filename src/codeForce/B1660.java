package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1660/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:48:34 PM -  Mar 31, 2022
 */
public class B1660 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			if (n == 1) {
				if (a[0] == 1) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
				continue;
			}
			if (Math.abs(a[n-1] - a[n-2]) > 1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		scanner.close();
	}
}
