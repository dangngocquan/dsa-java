package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1182/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:29:44 PM -  May 10, 2022
 */
public class A1182 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println((n % 2 == 0)? (long)Math.pow(2, n / 2) : 0);
		scanner.close();
	}
}
