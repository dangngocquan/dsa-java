package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1672/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:31:37 PM -  Apr 23, 2022
 */
public class A1672 {
	/**
	 *.
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += scanner.nextInt();
			}
			sum -= n;
			System.out.println((sum % 2 == 0)? "maomao90" : "errorgorn");
		}
		scanner.close();
	}
}
