package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1676/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 2:38:19 PM -  May 12, 2022
 */
public class B1676 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong();
			}
			long min = Long.MAX_VALUE;
			for (long element: a) {
				min = (element < min)? element : min;
			}
			long ans = 0;
			for (long element: a) {
				ans += element - min;
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
