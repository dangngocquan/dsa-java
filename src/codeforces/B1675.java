package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1675/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:42:25 PM -  May 5, 2022
 */
public class B1675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			long ans = 0;
			long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong();
			}
			
			for (int i = n - 1; i >= 1; i--) {
				if (a[i] < i) {
					ans = -1;
					break;
				}
				if (a[i-1] >= a[i]) {
					ans++;
					a[i-1] /= 2;
					i++;
				}
			}
			if (ans == -1) {
				System.out.println(ans);
				continue;
			}
			
			System.out.println(ans);
		}
		scanner.close();
	}
}
