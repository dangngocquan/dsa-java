package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1223/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:10:29 PM -  Jul 16, 2022
 */
public class A1223 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		while (q-- > 0) {
			int n = scanner.nextInt();
			if (n < 4) {
				System.out.println(4 - n);
			}else {
				System.out.println((n % 2 == 0)? 0 : 1);
			}
		}
		scanner.close();
	}
}
