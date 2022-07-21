package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1665/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 5:38:50 PM -  Apr 10, 2022
 */
public class A1665 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			System.out.println((n-3) + " " + 1 + " " + 1 + " " + 1);
		}
		scanner.close();
	}
}
