package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/118/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:56:49 PM -  May 4, 2022
 */
public class B118 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		for (int i = 0; i <= n; i++) {
			String s = "";
			for (int j = n; j >= 0; j--) {
				s += ((i - j >= 0)? ((i - j) + " ") : "  ");
			}
			for (int j = 1; j <= n; j++) {
				s += ((i - j >= 0)? ((i - j) + " ") : "");
			}
			System.out.println(s.stripTrailing());
		}
		
		for (int i = n-1; i >= 0; i--) {
			String s = "";
			for (int j = n; j >= 0; j--) {
				s += ((i - j >= 0)? ((i - j) + " ") : "  ");
			}
			for (int j = 1; j <= n; j++) {
				s += ((i - j >= 0)? ((i - j) + " ") : "");
			}
			System.out.println(s.stripTrailing());
		}
	}
}
