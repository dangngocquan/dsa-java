package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1399/D"> Link </a>
 * @author Bris
 * @since 4:01:50 PM - Sep 17, 2022
 *
 */
public class D1399 {
	public static boolean completed(int[] groupOfChar) {
		for (int i: groupOfChar) {
			if (i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			String s = scanner.next();
			int[] groupOfChar = new int[n];
			int count = 0;
			int tempChar = -1;
			while (!completed(groupOfChar)) {
				count++;
				for (int i = 0; i < n; i++) {
					char ch = s.charAt(i);
					if (groupOfChar[i] == 0) {
						if (tempChar == -1) {
							tempChar = ch - '0';
							groupOfChar[i] = count;
						}else {
							if (ch - '0' == 1 - tempChar) {
								groupOfChar[i] = count;
								tempChar = ch - '0';
							}
						}
					}
				}
				tempChar = -1;
			}
			System.out.println(count);
			for (int i : groupOfChar) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
