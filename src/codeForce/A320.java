package codeForce;

import java.util.Scanner;

public class A320 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		scanner.close();
		//Solve
		String ans = "YES";
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) != '1' && n.charAt(i) != '4') {
				ans = "NO";
				break;
			}
		}
		if (n.charAt(0) != '1') ans = "NO";
		for (int i = 0; i < n.length() - 2; i++) {
			if (n.charAt(i) == '4' && n.charAt(i+1) == '4' && n.charAt(i+2) == '4') {
				ans = "NO";
				break;
			}
		}
		//Output
		System.out.println(ans);
	}
}
