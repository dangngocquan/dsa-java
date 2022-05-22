package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1436/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:55:21 AM -  May 21, 2022
 */
public class A1436 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += scanner.nextInt();
			}
			System.out.println((sum == m)? "YES" : "NO");
		}
		scanner.close();
	}
}
