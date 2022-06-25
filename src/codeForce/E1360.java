package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1360/E"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:01:16 PM -  Jun 25, 2022
 */
public class E1360 {
	public static boolean isValid(char[][] matrix, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == '1') {
					if (matrix[i][j+1] == '0' && matrix[i+1][j] == '0') {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			char[][] matrix = new char[n+1][n+1];
			for (int i = 0; i < n; i++) {
				String s = scanner.next();
				for (int j = 0; j < n; j++) {
					matrix[i][j] = s.charAt(j);
				}
				matrix[i][n] = '1';
			}
			for (int j = 0; j <= n; j++) {
				matrix[n][j] = '1';
			}
			
			System.out.println(isValid(matrix, n)? "YES" : "NO");
		}
		scanner.close();
	}
}
