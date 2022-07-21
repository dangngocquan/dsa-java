package codeforces;

import java.util.Scanner;

public class A1650 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			char c = scanner.next().charAt(0);
			String ans = "NO";
			for (int i = 0; i < s.length(); i+=2) {
				if (s.charAt(i) == c) {
					ans = "YES";
					break;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
