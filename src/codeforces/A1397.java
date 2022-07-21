package codeforces;

import java.util.Scanner;

public class A1397 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[26];
			String s = "";
			for (int j = 0; j < n; j++) s += scanner.next();
			for (int j = 0; j < s.length(); j++) a[s.charAt(j) - 'a']++;
			ans[i] = "YES";
			for (int j: a) {
				if (j%n != 0) {
					ans[i] = "NO";
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
