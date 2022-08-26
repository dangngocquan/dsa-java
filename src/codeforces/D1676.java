package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1676/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:06:30 PM -  Aug 26, 2022
 */
public class D1676 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[][] matrix = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = scanner.nextInt();
				}
			}
			int max = 0;
			for (int i = 0; i < n*m; i++) {
				int row = i/m;
				int column = i%m;
				int sum = 0;
				int tempRow = row - Math.min(row, column);
				int tempColumn = column - Math.min(row, column);
				while (tempRow < n && tempRow >= 0 && tempColumn < m && tempColumn >= 0) {
					sum += matrix[tempRow][tempColumn];
					tempRow++;
					tempColumn++;
				}
				
				tempRow = row - Math.min(m-1-column, row);
				tempColumn = column + Math.min(m-1-column, row);
				while (tempRow < n && tempRow >= 0 && tempColumn < m && tempColumn >= 0) {
					sum += matrix[tempRow][tempColumn];
					tempRow++;
					tempColumn--;
				}
				
				sum -= matrix[row][column];
				max = Math.max(max, sum);
			}
			System.out.println(max);
		}
		scanner.close();
	}
}
