package codeForce;

import java.util.Scanner;

public class A731 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		char temp = 'a';
		int res = 0;
		for (int i = 0; i< s.length();i++) {
			int x = Math.abs(s.charAt(i) - temp);
			if (x > 13) {
				res += 26-x;
			}else {
				res += x;
			}
			temp = s.charAt(i);
		}
		//Output
		System.out.println(res);
	}
}
