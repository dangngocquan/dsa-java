package codeForce;

import java.util.Scanner;

public class A41 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		scanner.close();
		//Solve
		String res = "NO";
		char[] arr = s.toCharArray();
		String a = "";
		for (char i: arr) {
			a = i+ a;
		}
		if (a.equals(t)) res = "YES";
		//Output
		System.out.println(res);
	}
	
}
