package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1713/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:29:31 PM -  Aug 6, 2022
 */
public class C1713 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] ans = new int[n];
			int tempNumber = (int)(Math.sqrt(2*n-2)) * (int)(Math.sqrt(2*n-2)) - (n-1);
			int tempIndex = n-1;
			int tempMax = n-1;
			while (tempIndex >= 0) {
				if (tempNumber > tempMax) {
					tempNumber = (int)(Math.sqrt(2*tempIndex)) * (int)(Math.sqrt(2*tempIndex)) - tempIndex;
					tempMax = tempIndex;
				}
				ans[tempIndex] = tempNumber;
				tempIndex--;
				tempNumber++;
			}
			for (int i : ans) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
