package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/275/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:15:49 PM -  Jul 16, 2022
 */
public class A275 {
	public static void excute(int[][] matrix, int row, int column) {
		matrix[row-1][column] = (matrix[row-1][column] + 1) % 2;
		matrix[row][column-1] = (matrix[row][column-1] + 1) % 2;
		matrix[row][column] = (matrix[row][column] + 1) % 2;
		matrix[row][column+1] = (matrix[row][column+1] + 1) % 2;
		matrix[row+1][column] = (matrix[row+1][column] + 1) % 2;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = 1;
			}
		}
		
		for (int i = 1; i <= 3; i++  ) {
			for (int j = 1; j <= 3; j++) {
				int x = scanner.nextInt() % 2;
				if (x == 1) {
					excute(matrix, i, j);
				}
			}
		}
		
		for (int i = 1; i  <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
