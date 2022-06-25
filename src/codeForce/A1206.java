package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1206/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:12:34 AM -  Jun 25, 2022
 */
public class A1206 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max1 = 0;
		for (int i = 0; i < n; i++) {
			max1 = Math.max(max1, scanner.nextInt());
		}
		int m = scanner.nextInt();
		int max2 = 0;
		for (int i = 0; i < m; i++) {
			max2 = Math.max(max2,  scanner.nextInt());
		}
		scanner.close();
		System.out.println(max1 + " " + max2);
	}
}
