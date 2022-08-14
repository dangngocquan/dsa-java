package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/contest/1702/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 2:46:53 PM -  Aug 14, 2022
 */
public class B1702 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String s = scanner.next();
			int index = 0;
			Set<Character> set = new LinkedHashSet<>();
			int days = 1;
			while (index < s.length()) {
				set.add(s.charAt(index));
				if (set.size() > 3) {
					set.clear();
					days++;
					set.add(s.charAt(index));
				}
				index++;
			}
			System.out.println(days);
		}
		scanner.close();
	}
}
