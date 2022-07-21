package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1421/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:15:55 PM -  May 5, 2022
 */
public class A1421 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			System.out.println((long)(a^b));
		}
		scanner.close();
	}
}
