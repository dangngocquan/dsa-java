package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1675/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:12:12 PM -  May 5, 2022
 */
public class C1675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			int indexOfFirst0 = s.length()-1;
			int indexOfLast1Near0 = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					indexOfFirst0 = i;
					break;
				}
			}
			for (int i = indexOfFirst0; i >= 0; i--) {
				if (s.charAt(i) == '1') {
					indexOfLast1Near0 = i;
					break;
				}
			}
			System.out.println(indexOfFirst0 - indexOfLast1Near0 + 1);
		}
		scanner.close();
	}
}
