package codeforces;

import java.util.Scanner;

public class B1547 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			char endChar = (char)('a' -1 + s.length());
			String ans = "YES";
			while (s.length() > 0) {
				if (s.charAt(0) == endChar) {
					s = s.substring(1);
					endChar--;
				}else if (s.charAt(s.length()-1) == endChar) {
					s = s.substring(0,s.length()-1);
					endChar--;
				}else {
					ans = "NO";
					break;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
