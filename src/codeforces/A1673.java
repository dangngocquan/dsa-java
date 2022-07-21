package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1673/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:53:28 PM -  Apr 30, 2022
 */
public class A1673 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			int totalPoints = 0;
			for (int i = 0; i < s.length(); i++) {
				totalPoints += (s.charAt(i) - 'a') + 1;
			}
			if (s.length() % 2 == 0) {
				System.out.println("Alice " + totalPoints);
			}else {
				int pointAlice1 = totalPoints - (s.charAt(0) - 'a' + 1);
				int pointAlice2 = totalPoints - (s.charAt(s.length()-1) - 'a' + 1);
				int pointAlice = Math.max(pointAlice1, pointAlice2);
				int pointBob = totalPoints - pointAlice;
				if (pointAlice > pointBob) {
					System.out.println("Alice " + (pointAlice - pointBob));
				}else {
					System.out.println("Bob " + (pointBob - pointAlice));
				}
			}
		}
		scanner.close();
	}
}
