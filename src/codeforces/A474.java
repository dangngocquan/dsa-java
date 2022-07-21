package codeforces;

import java.util.Scanner;

public class A474 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String status = scanner.next();
		String s = scanner.next();
		scanner.close();
		//Solve
		char[] a = new char[127];
		String ss = "qwertyuiopasdfghjkl;zxcvbnm,./";
		if (status.equals("R")) {
			for (int i = 1; i < ss.length(); i++) {
				a[(int)ss.charAt(i)] = ss.charAt(i-1);
			}
		}else {
			for (int i = 0; i < ss.length()-1; i++) {
				a[(int)ss.charAt(i)] = ss.charAt(i+1);
			}
		}
		//Output
		for (int i = 0; i < s.length(); i++) System.out.print(a[(int)s.charAt(i)]);
	}
}
