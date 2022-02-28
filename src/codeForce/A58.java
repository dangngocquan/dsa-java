package codeForce;

import java.util.Scanner;

public class A58 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		String res = "YES";
		String hello = "hello";
		char[] arr = hello.toCharArray();
		int indexCheck = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == arr[indexCheck]) {
				indexCheck++;
				if (indexCheck == 5) break;
			}
		}
		if (indexCheck <5) {
			res = "NO";
		}
		//Output
		System.out.println(res);
	}
}
