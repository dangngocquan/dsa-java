package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1474/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:15:58 AM -  May 10, 2022
 */
public class A1474 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			String b = scanner.next();
			char tempCharD = '0';
			StringBuilder a = new StringBuilder();
			
			for (int i = 0; i < n; i++) {
				char charChecking = b.charAt(i);
				if (charChecking == '1') {
					if (tempCharD != '2') {
						a.append('1');
						tempCharD = '2';
					}else {
						a.append('0');
						tempCharD = '1';
					}
				}else {
					if (tempCharD != '1') {
						a.append('1');
						tempCharD = '1';
					}else {
						a.append('0');
						tempCharD = '0';
					}
				}
			}
			System.out.println(a);
		}
		scanner.close();
	}
}
