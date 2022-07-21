package codeforces;

import java.util.Scanner;

public class B1296 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int s = scanner.nextInt();
			ans[i] += s;
			while (s >=10) {
				ans[i] += s/10;
				s = s/10 + s%10;
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
