package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1712/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:49:37 PM -  Aug 13, 2022
 */
public class B1712 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			if (n % 2 == 0) {
				for (int i = 1; i <= n; i++) {
					if (i % 2 == 0) {
						System.out.print((i-1) + " ");
					}else {
						System.out.print((i+1) + " ");
					}
				}
			}else {
				System.out.print(1 + " ");
				for (int i = 2; i <= n; i++) {
					if (i % 2 == 0) {
						System.out.print((i+1) + " ");
					}else {
						System.out.print((i-1) + " ");
					}
				}
			}
		}
		scanner.close();
	}
}
