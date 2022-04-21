package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1669/problem/0"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:36:19 PM -  Apr 21, 2022
 */
public class A1669 {
	/**
	 * The main method.
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t--> 0) {
			int n = scanner.nextInt();
			if (n >= 1900) {
				System.out.println("Division 1");
				continue;
			}
			if (n >= 1600) {
				System.out.println("Division 2");
				continue;
			}
			if (n >= 1400) {
				System.out.println("Division 3");
				continue;
			}
			System.out.println("Division 4");
		}
	}
}
