package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1716/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:51:31 PM -  Aug 14, 2022
 */
public class A1716 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			if (n % 3 == 0) {
				System.out.println(n /3);
			}else if (n % 3 == 1) {
				if (n > 1) {
					System.out.println((n-4)/3 + 2);
				}else {
					System.out.println(2);
				}
			}else {
				System.out.println((n-2)/3 + 1);
			}
		}
		scanner.close();
	}
}
