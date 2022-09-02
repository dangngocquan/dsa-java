package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1702/D"> Link </a>
 * @author Bris
 * @since 6:40:36 AM - Sep 2, 2022
 *
 */
public class D1702 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] count = new int[26];
		while (t-- > 0) {
			String s = scanner.next();
			int p = scanner.nextInt();
			int sum = 0;		
			char[] asArray = s.toCharArray();
			for (char ch : asArray) {
				count[ch-'a']++;
				sum += ch - 'a' + 1;
			}
			for (char ch = 'z'; ch >= 'a'; ch--) {
				if (sum <= p) {
					break;
				}
				if (count[ch - 'a'] > 0) {
					sum -= (ch - 'a' + 1);
					count[ch - 'a']--;
					ch++;
				}
			}
			for (char ch : asArray) {
				if (count[ch - 'a'] > 0) {
					System.out.print(ch);
					count[ch - 'a']--;
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
