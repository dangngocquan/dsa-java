package luyenCode;

import java.util.Scanner;

public class SUMDIG {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			for (int j = 0; j < s.length(); j++) {
				ans[i] += (s.charAt(j) - '0');
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i); 
	}
}
