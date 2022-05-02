package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1486/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:32:30 AM -  May 2, 2022
 */
public class A1486 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			long[] h = new long[n];
			for (int i = 0; i < n; i++) {
				h[i] = scanner.nextLong();
			}
			
			boolean canMake = true;
			for (int i = 0; i < n-1; i++) {
				if (h[i] < i) {
					canMake = false;
					break;
				}
				h[i+1] += h[i] - i;
			}
			if (h[n-1] < n-1) {
				canMake = false;
			}
			System.out.println((canMake)? "YES" : "NO");
		}
		scanner.close();
	}
}
