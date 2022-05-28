package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1369/problem/B"> LInk </a>
 * @author Bris
 * @version 1.0
 * @since 7:39:30 PM -  May 28, 2022
 */
public class B1369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			String s = scanner.next();
			int tempIndex = -1;
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) == '0') {
					System.out.print('0');
					tempIndex = i;
				}else {
					break;
				}
			}
			int indexOfLast0 = s.lastIndexOf('0');
			if (indexOfLast0 > -1) {
				for (int i = indexOfLast0; i < n; i++) {
					if (tempIndex == i) {
						continue;
					}
					System.out.print(s.charAt(i));
				}
			}else {
				System.out.print(s);
			}
			System.out.println();
		}
		scanner.close();
	}
}
