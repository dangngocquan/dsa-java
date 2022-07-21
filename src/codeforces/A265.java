package codeforces;

import java.util.Scanner;

public class A265 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		scanner.close();
		int position = 0;
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == s.charAt(position)) position++;
			if (position == s.length()-1) break;
		}
		System.out.println(position+1);
	}
}
