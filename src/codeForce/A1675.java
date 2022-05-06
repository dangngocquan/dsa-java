package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1675/problem/0"> LInk </a>
 * @author Bris
 * @version 1.0
 * @since 9:35:27 PM -  May 5, 2022
 */
public class A1675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			long x = scanner.nextLong();
			long y  =scanner.nextLong();
			if (a + c < x) {
				System.out.println("NO");
				continue;
			}
			if (a < x) {
				c -= (x - a);
			}
			if (b + c < y) {
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
		}
		scanner.close();
	}
}
