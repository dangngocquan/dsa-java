package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1499/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:59:01 AM -  Jul 23, 2022
 */
public class A1499 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k1 = scanner.nextInt();
			int k2 = scanner.nextInt();
			int w = scanner.nextInt();
			int b = scanner.nextInt();
			int min = Math.min(k1, k2);
			int max = Math.max(k1, k2);
			if (min + (max - min) / 2 >= w && (n - max) + (max - min) / 2 >= b) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
