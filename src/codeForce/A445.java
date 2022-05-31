package codeForce;

import java.util.Scanner;

/**
 * <a  href = "https://codeforces.com/contest/445/problem/A"> Lik </a>
 * @author Bris
 * @version 1.0
 * @since 3:01:04 PM -  May 30, 2022
 */

public class A445 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		char[][] matrix = new char[n][m];
		for (int i = 0; i < n; i++) {
			matrix[i] = scanner.next().toCharArray();
		}
		scanner.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == '.') {
					if ((i+j) % 2 == 0) {
						matrix[i][j] = 'B';
					}else {
						matrix[i][j] = 'W';
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
