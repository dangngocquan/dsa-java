package codeForce;

import java.util.Scanner;

public class A1303 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			int start = -1;
			int end = -1;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1') {
					start = j;
					break;
				}
			}
			for (int j = s.length()-1; j >= 0; j--) {
				if (s.charAt(j) == '1') {
					end = j;
					break;
				}
			}
			if (start >= 0) {
				for (int j = start; j <= end; j++) {
				if (s.charAt(j) == '0') ans[i]++;
				}
			}
			
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
