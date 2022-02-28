package codeForce;

import java.util.Scanner;

public class A1632 {
	static String getResult(int n, String s) {
		String res = "YES";
		if (n>= 3) {
			res = "NO";
		}else if (n==2) {
			if (s.charAt(0) == s.charAt(1)) {
				res = "NO";
			}
		}else {
			res = "YES";
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			String s = scanner.next();
			res[i] = getResult(n, s);
		}
		scanner.close();
		//Output
		for (String i : res) {
			System.out.println(i);
		}
	}
}
