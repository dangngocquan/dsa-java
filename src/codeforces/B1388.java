package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1388/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:53:01 PM -  Jun 8, 2022
 */
public class B1388 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			for (int i = 1; i <= n - Math.ceil(n*1.0/4); i++) {
				System.out.print("9");
			}
			for (int i = 1; i <= Math.ceil(n*1.0/4); i++) {
				System.out.print("8");
			}
			System.out.println();
		}
		scanner.close();
	}
}
