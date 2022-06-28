package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1051/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:17:09 AM -  Jun 28, 2022
 */
public class C1051 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] s = new int[n];
		int[] counts = new int[101];
		for (int i = 0; i < n; i++) {
			s[i] = scanner.nextInt();
			counts[s[i]]++;
		}
		scanner.close();
		
		int count1 = 0;
		for (int i : s) {
			count1 += (counts[i] == 1)? 1 : 0;
		}
		
		if (count1 % 2 == 0) {
			System.out.println("YES");
			char[] ans = new char[n];
			int tempCount = 0;
			for (int i = 0; i < n; i++) {
				if (tempCount < count1 / 2 && counts[s[i]] == 1) {
					ans[i] = 'A';
					tempCount++;
				}else {
					ans[i] = 'B';
				}
			}
			for (char i : ans) {
				System.out.print(i);
			}
		}else {
			int indexFinding = -1;
			for (int i = 0; i < n; i++) {
				if (counts[s[i]] >= 3) {
					indexFinding = i;
					break;
				}
			}
			
			if (indexFinding == -1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
				char[] ans = new char[n];
				int tempCount = 0;
				for (int i = 0; i < n; i++) {
					if (tempCount < count1 / 2 && counts[s[i]] == 1) {
						ans[i] = 'A';
						tempCount++;
					}else {
						ans[i] = 'B';
					}
				}
				ans[indexFinding] = 'A';
				for (char i : ans) {
					System.out.print(i);
				}
			}
		}
	}
}
