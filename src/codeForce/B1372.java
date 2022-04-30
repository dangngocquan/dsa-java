package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1372/B" > Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:05:51 AM -  Apr 30, 2022
 */
public class B1372 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int a = -1;
			int b = -1;
			int n = scanner.nextInt();
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					a = n/i;
					b = n - a;
					break;
				}
			}
			if (a == -1) {
				a = 1;
				b = n - 1;
			}
			System.out.printf("%d %d\n", a, b);
		}
		scanner.close();
	}
}
