package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1550/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:41:38 PM -  Jun 7, 2022
 */
public class B1550 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			String s = scanner.next();
			int ans;
			if (b >= 0) {
				ans = (a+b)*n;
			}else {
				s = s.replaceAll("[0]{1,}", "0");
				s = s.replaceAll("[1]{1,}", "1");
				int count0 = 0;
				int count1 = 0;
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == '0') {
						count0++;
					}else {
						count1++;
					}
				}
				
				int min = Math.min(count1, count0);
				ans = a * n + b * (min + 1);
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
