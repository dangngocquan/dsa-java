package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1355/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:35:14 PM -  Apr 25, 2022
 */
public class A1355 {
	/**
	 * .
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong();
		while (t-->0) {
			long a1 = scanner.nextLong();
			long k = scanner.nextLong();
			long ak = a1;
			int turn = 2;
			while (turn <= k) {
				String s = ak + "";
				int tempMinDigit = 9, tempMaxDigit = 0;
				for (int i = 0; i < s.length(); i++) {
					tempMinDigit = Math.min(tempMinDigit, s.charAt(i) - '0');
					tempMaxDigit = Math.max(tempMaxDigit, s.charAt(i) - '0');
				}
				ak += tempMinDigit * tempMaxDigit;
				turn++;
				if (tempMinDigit == 0) {
					break;
				}
			}
			System.out.println(ak);
		}
		scanner.close();
	}
}
