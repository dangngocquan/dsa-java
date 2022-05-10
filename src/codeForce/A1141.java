package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1141/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:46:27 AM -  May 7, 2022
 */
public class A1141 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		
		if (m % n != 0) {
			System.out.println(-1);
			return;
		}
		int count = 0;
		int k = m / n;
		while (k % 3 == 0) {
			count++;
			k /= 3;
		}
		while (k % 2 == 0) {
			count++;
			k /= 2;
		}
		System.out.println((k == 1)? (count) : -1);
	}
}
