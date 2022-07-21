package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1552/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:49:47 PM -  May 15, 2022
 */
public class A1552 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			String s = scanner.next();
			char[] inputCharArray = s.toCharArray();
			char[] inputCharArraySorted = s.toCharArray();
			Arrays.sort(inputCharArraySorted);
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (inputCharArray[i] != inputCharArraySorted[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}
}
