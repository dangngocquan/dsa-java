package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/276/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:30:15 AM -  Jul 14, 2022
 */
public class B276 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] count = new int[26];
		String s = scanner.next();
		scanner.close();
		
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}
		int odd_count = 0;
		for (int i : count) {
			if (i % 2 != 0) {
				odd_count++;
			}
		}
				
		if (odd_count <= 1) {
			System.out.println("First");
		}else {
			if ((odd_count - 1) % 2 == 0) {
				System.out.println("First");
			}else {
				System.out.println("Second");
			}
		}
				
	}
}
