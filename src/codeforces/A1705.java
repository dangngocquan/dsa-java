package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1705/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 3:50:27 PM -  Aug 14, 2022
 */
public class A1705 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t--> 0) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int[] h = new int[2*n];
			for (int i = 0; i < 2*n; i++) {
				h[i] = scanner.nextInt();
			}
			Arrays.sort(h);
			String ans = "YES";
			for (int i = 0; i < n; i++) {
				if (h[i] + x > h[i+n]) {
					ans = "NO";
					break;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
