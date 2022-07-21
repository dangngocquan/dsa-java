package codeforces;

import java.util.Scanner;

public class A1619 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			int k = s.length();
			if (k%2==1) {
				res[i] = "NO";
			}else {
				if (s.substring(0, k/2).equals(s.substring(k/2))) {
					res[i] = "YES";
				}else {
					res[i] = "NO";
				}
			}
		}
		scanner.close();
		//Outptu
		for (String i : res) System.out.println(i);
	}
}
