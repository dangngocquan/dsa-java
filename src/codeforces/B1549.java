package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1549/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:42:38 PM -  Jul 16, 2022
 */
public class B1549 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			char[][] matrix = new char[2][n];
			matrix[0] = scanner.next().toCharArray();
			matrix[1] = scanner.next().toCharArray();
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (matrix[1][i] == '0') {
					continue;
				}
				if (i == 0) {
					if (matrix[0][i] == '0') {
						ans++;
						matrix[0][i] = '2';
					}else if (matrix[0][i+1] == '1') {
						ans++;
						matrix[0][i+1] = '2';
					}
				}else if (i == n-1) {
					if (matrix[0][i] == '0') {
						ans++;
						matrix[0][i] = '2';
					}else if (matrix[0][i-1] == '1') {
						ans++;
						matrix[0][i-1] = '2';
					}
				}else {
					if (matrix[0][i] == '0') {
						ans++;
						matrix[0][i] = '2';
					}else if (matrix[0][i-1] == '1') {
						ans++;
						matrix[0][i-1] = '2';
					}else if (matrix[0][i+1] == '1') {
						ans++;
						matrix[0][i+1] = '2';
					}
				}
				
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
