package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1690/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:10:52 AM -  Jul 23, 2022
 */
public class B1690 {
	public static boolean isAble(int[] a, int[] b, int maxA, int maxB) {
		if (maxA < maxB) {
			return false;
		}
		int abs = maxA - maxB;
		for (int i = 0; i < a.length; i++) {
			if (a[i] - b[i] != abs) {
				if (a[i] - b[i] > abs) {
					return false;
				}else if (a[i] - b[i] < abs) {
					if (b[i] != 0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int maxA = 0;
			int maxB = 0;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				maxA = Math.max(maxA, a[i]);
			}
			for (int i = 0; i < n; i++) {
				b[i] = scanner.nextInt();
				maxB = Math.max(maxB, b[i]);
			}
			if (isAble(a, b, maxA, maxB)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
