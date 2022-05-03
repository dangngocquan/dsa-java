package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1516/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:26:04 PM -  May 3, 2022
 */
public class A1516 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			
			int[] b = new int[n];
			b[n-1] = a[n-1];
			for (int i = 0; i < n; i++) {
				if (i == (n - 1)) {
					continue;
				}
				if (k == 0) {
					b[i] = a[i];
					continue;
				}
				
				if (a[i] > 0) {
					if (a[i] >= k) {
						b[i] = a[i] - k;
						b[n-1] += k;
						k = 0;
					}else {
						b[i] = 0;
						b[n-1] += a[i];
						k -= a[i];
					}
				}else {
					b[i] = a[i];
				}
			}
			
			for (int i = 0; i < n; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
