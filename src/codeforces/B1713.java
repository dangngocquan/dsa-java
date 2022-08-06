package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1713/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:11:38 PM -  Aug 6, 2022
 */
public class B1713 {
	public static boolean check(int[] a) {
		int l = 0;
		int r = a.length - 1;
		int min = Math.min(a[l], a[r]);
		while (l < r) {
			int tempMin = Math.min(a[l], a[r]);
			if (tempMin < min) {
				return false;
			}
			min = tempMin;
			if (a[l] == min) {
				l++;
			}else if (a[r] == min) {
				r--;
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
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			if (check(a)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
