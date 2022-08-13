package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/588/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:42:06 PM -  Aug 7, 2022
 */
public class A588 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int tempMin = 101;
		int total = 0;
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			tempMin = Math.min(tempMin, b);
			total += a * tempMin;
		}
		System.out.println(total);
		scanner.close();
	}
}
