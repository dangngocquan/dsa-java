package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1334/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:40:58 AM -  Jun 8, 2022
 */
public class A1334 {
	public static boolean isValid(int[] p, int[] c) {
		for (int i = 0; i < p.length - 1; i++) {
			if (p[i] > p[i+1] || c[i] > c[i+1] || c[i+1] - c[i] > p[i+1] - p[i]) {
				return false;
			}
		}
		for (int i = 0; i < p.length; i++) {
			if (c[i] > p[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] p = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = scanner.nextInt();
				c[i] = scanner.nextInt();
			}
			
			if (isValid(p, c)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
