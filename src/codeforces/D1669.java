package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1669/problem/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:00:44 PM -  Apr 21, 2022
 */
public class D1669 {
	public static boolean isFullAColor(String s) {
		boolean isFullB = true;
		boolean isFullR = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'B') {
				isFullR = false;
			}
			if (s.charAt(i) == 'R') {
				isFullB = false;
			}
		}
		if (isFullB || isFullR) {
			return true;
		}
		return false;
	}
	
	/**
	 * .
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t--> 0) {
			int n = scanner.nextInt();
			String s = scanner.next();
			String ans = "YES";
			
			n += 2;
			s = "W" + s + "W";
			int indexStart = -1;
			int indexEnd = -1;
			for (int i = 0; i < n; i++) {
				if (indexStart == - 1) {
					if (s.charAt(i) != 'W') {
						indexStart = i;
					}
				}else {
					if (s.charAt(i) == 'W') {
						indexEnd = i+1;
						if (isFullAColor(s.substring(indexStart, indexEnd))) {
							ans = "NO";
						}
						indexStart = -1;
						indexEnd = -1;
					}
				}
			}
			
			System.out.println(ans);
			
		}
		scanner.close();
	}
}
