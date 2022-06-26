package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/525/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:40:34 AM -  Jun 26, 2022
 */
public class B525 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		int m = scanner.nextInt();
		int[] count = new int[(s.length + 1)/2];
		for (int i = 0; i < m; i++) {
			count[scanner.nextInt()-1]++;
		}
		scanner.close();
		
		int temp = 0;
		for (int i = 0; i < count.length; i++) {
			temp += count[i];
			if (temp % 2 != 0) {
				char ch = s[i];
				s[i] = s[s.length-i-1];
				s[s.length - i - 1] = ch;
			}
		}
		
		for (char i : s) {
			System.out.print(i);
		}
	}
}
