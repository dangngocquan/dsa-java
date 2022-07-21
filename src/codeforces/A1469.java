package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1469/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:19:41 PM -  Apr 11, 2022
 */
public class A1469 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String inputString = scanner.next();
			if (inputString.charAt(0) != ')' && inputString.charAt(inputString.length() - 1) != '(' && inputString.length() %2 == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
