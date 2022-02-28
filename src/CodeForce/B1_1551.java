package CodeForce;

import java.util.Scanner;

public class B1_1551 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int[] a = new int[26];
			String s = scanner.next();
			for (int j = 0; j < s.length(); j++) {
				if (a[s.charAt(j) - 'a'] < 2) a[s.charAt(j)-'a']++;
			}
			for (int j : a) ans[i] += j;
			ans[i] /= 2;
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
