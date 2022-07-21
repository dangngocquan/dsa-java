package luyencode;

import java.util.Scanner;

public class SPACE {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.nextLine();
			s= s.replaceAll("[ ]{1,}", "1");
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1') ans[i]++;
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
