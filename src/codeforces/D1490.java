package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1490/D"> Link </a>
 * @author Bris
 * @since 7:17:34 AM - Sep 4, 2022
 *
 */
public class D1490 {
	public static void solve(int[] a, int indexStart, int indexEnd, int[] depth, int maxCurrentDepth) {
		int indexOfMaxValue = -1;
		int maxValue = -1;
		for (int i = indexStart; i <= indexEnd; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
				indexOfMaxValue = i;
			}
		}
		if (indexOfMaxValue == -1) {
			return;
		}
		depth[maxValue] = maxCurrentDepth + 1;
		solve(a, indexStart, indexOfMaxValue-1, depth, maxCurrentDepth+1);
		solve(a, indexOfMaxValue+1, indexEnd, depth, maxCurrentDepth+1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			int[] depth = new int[n+1];
			solve(a, 0, n-1, depth, -1);
			for (int i : a) {
				System.out.print(depth[i] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
