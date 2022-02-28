package codeForce;

import java.util.Scanner;

public class B1335 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
//			int a = scanner.nextInt();
			int b = scanner.nextInt();
			res[i] = "";
			for (int j = 0; j < n; j++) {
				res[i] += (char)('a' + j%b);
			}
		}
		scanner.close();
		//Output
		for (String i: res) System.out.println(i);
	}
}
