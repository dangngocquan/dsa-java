package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1393/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 3:36:10 PM -  Aug 14, 2022
 */
public class A1393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			System.out.println(1 + n/2);
		}
		scanner.close();
	}
}
