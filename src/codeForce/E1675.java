package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1675/problem/E"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:04:15 PM -  May 5, 2022
 */
public class E1675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			String s = scanner.next();
			
			if (k >= 26) {
				s = s.replaceAll("[a-z]{1}", "a");
				System.out.println(s);
				continue;
			}else {
				while (k > 0) {
					char theFirstCharDifferentA = 'a';
					for (int i = 0; i < n; i++) {
						if (s.charAt(i) > 'a') {
							theFirstCharDifferentA = s.charAt(i);
							break;
						}
					}
					if (theFirstCharDifferentA == 'a') {
						break;
					}
					if (k <= theFirstCharDifferentA - 'a') {
						s = s.replaceAll(String.format("[%s-%s]{1}", (char)(theFirstCharDifferentA - k) + "", theFirstCharDifferentA) + "", (char)(theFirstCharDifferentA - k) + "");
						break;
					}else {
						char maxChar = theFirstCharDifferentA;
						for (int i = 0; i < n; i++) {
							if (s.charAt(i) > maxChar && s.charAt(i) - 'a' <= k) {
								maxChar = s.charAt(i);
							}
						}
						if (maxChar - 'a' <= k) {
							s = s.replaceAll(String.format("[%s-%s]{1}","a", maxChar + ""),"a");
							k -= maxChar - 'a';
						}else {
							s = s.replaceAll(String.format("[%s-%s]{1}", (char)(maxChar - k) + "", maxChar) + "", (char)(maxChar - k) + "");
							k = 0;
						}
						
						
					}
				}
				
				System.out.println(s);
			}
		}
		scanner.close();
	}
}
