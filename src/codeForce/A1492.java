package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1492/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:20:21 PM -  May 22, 2022
 */
public class A1492 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long p = scanner.nextLong();
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			long a1 = (p % a == 0)? 0 : a - p % a;
			long b1 = (p % b == 0)? 0 : b - p % b;
			long c1 = (p % c == 0)? 0 : c - p % c;
			System.out.println(Math.min(Math.min(a1, b1), c1));
		}
		scanner.close();
	}
}
