package codeforces;

import java.util.Arrays;
import java.util.Scanner;
 
/**
 * <a href = "https://codeforces.com/problemset/problem/1512/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:58:21 PM -  Aug 28, 2022
 */
public class D1512 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			long sum = 0;
			int[] b = new int[n+2];
			for (int i = 0; i < n+2; i++) {
				b[i] = scanner.nextInt();
				sum += (long)(b[i]);
			}
			Arrays.sort(b);
			int sumNumber = b[n+1];
			int indexSumNumber = n+1;
			int indexX = -1;
			int x = b[n];
			for (int i = 0; i <= n; i++) {
				x = b[i];
				if (sum - x - sumNumber == sumNumber) {
					indexX = i;
					break;
				}
			}
			if (indexX == -1) {
				sumNumber = b[n];
				indexSumNumber = n;
				for (int i = 0; i <= n+1; i++) {
					if (i == n) {
						continue;
					}
					x = b[i];
					if (sum - x - sumNumber == sumNumber) {
						indexX = i;
						break;
					}
				}
			}
			if (indexX == -1) {
				System.out.println(-1);
			}else {
				for (int i = 0; i < n+2; i++) {
					if (i == indexX || i == indexSumNumber) {
						continue;
					}
					System.out.print(b[i] + " ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
