package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1672/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:39:14 PM -  Apr 23, 2022
 */
public class B1672 {
	/**
	 * .
	 * @param s .
	 * @return .
	 */
	public static boolean isGood(String s) {
		if (s.length() < 2) {
			return false;
		}
		if (s.length() == 2) {
			return s.equals("AB");
		}
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				countA++;
			}else {
				countB++;
			}
			if (countA < countB) {
				return false;
			}
		}
		return (countA >= countB) && (s.charAt(s.length() - 1) == 'B') && (s.charAt(0) != 'B');
	}
	/**
	 * .
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s2 = scanner.next();
			System.out.println((isGood(s2))? "YES" : "NO");
		}
		scanner.close();
	}
}
