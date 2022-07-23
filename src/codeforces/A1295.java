package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1295/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:45:34 AM -  Jul 23, 2022
 */
public class A1295 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			while (n > 1) {
				if (n % 2 == 0) {
					System.out.print(1);
					n -= 2;
				}else {
					System.out.print(7);
					n -= 3;
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
