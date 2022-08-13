package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1574/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:29:43 PM -  Aug 7, 2022
 */
public class A1574 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print('(');
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(')');
				}
				for (int j = 1; j <= n- i; j++) {
					System.out.print("()");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
