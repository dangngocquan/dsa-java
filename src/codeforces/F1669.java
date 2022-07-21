package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1669/problem/F"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:20:55 PM -  Apr 21, 2022
 */
public class F1669 {
	/**
	 * .
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			long[] w = new long[n];
			for (int i = 0; i < n; i++) {
				w[i] = scanner.nextLong();
			}
			
			int tempLeft = -1;
			int tempRight = n;
			int ans = 0;
			long tempSumLeft = 0;
			long tempSumRight = 0;
			while (tempLeft < tempRight) {
				if (tempSumLeft == tempSumRight) {
					tempLeft++;
					tempRight--;
					if (tempLeft < tempRight) {
						tempSumLeft += w[tempLeft];
						tempSumRight += w[tempRight];
					}else {
						tempLeft--;
						tempRight++;
						break;
					}
				}else if (tempSumLeft < tempSumRight) {
					tempLeft++;
					if (tempLeft < tempRight) {
						tempSumLeft += w[tempLeft];
					}else {
						tempLeft--;
						break;
					}
				}else {
					tempRight--;
					if (tempLeft < tempRight) {
						tempSumRight += w[tempRight];
					}else {
						tempRight++;
						break;
					}
				}
				if (tempSumLeft == tempSumRight) {
					ans = (tempLeft + 1) +(n - tempRight);
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
