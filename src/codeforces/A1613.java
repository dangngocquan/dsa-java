package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1613/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:03:09 PM -  Aug 14, 2022
 */
public class A1613 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String x1 = scanner.next();
			int p1 = scanner.nextInt();
			String x2 = scanner.next();
			int p2 = scanner.nextInt();
			if (x1.length() + p1 < x2.length() + p2) {
				System.out.println("<");
			}else if (x1.length() + p1 > x2.length() + p2) {
				System.out.println(">");
			}else {
				if (x1.length() < x2.length()) {
					if (x1.compareTo(x2.substring(0, x1.length())) < 0) {
						System.out.println("<");
					}else if (x1.compareTo(x2.substring(0, x1.length())) > 0) {
						System.out.println(">");
					}else {
						if (Integer.valueOf(x2.substring(x1.length())) > 0) {
							System.out.println("<");
						}else {
							System.out.println("=");
						}
					}
				}else if (x1.length() > x2.length()) {
					if (x2.compareTo(x1.substring(0, x2.length())) < 0) {
						System.out.println(">");
					}else if (x2.compareTo(x1.substring(0, x2.length())) > 0) {
						System.out.println("<");
					}else {
						if (Integer.valueOf(x1.substring(x2.length())) > 0) {
							System.out.println(">");
						}else {
							System.out.println("=");
						}
					}
				}else {
					if (x1.compareTo(x2) > 0) {
						System.out.println(">");
					}else if (x1.compareTo(x2) < 0) {
						System.out.println("<");
					}else {
						System.out.println("=");
					}
				}
			}
		}
		scanner.close();
	}
}
