package codeforces;

import java.util.Scanner;

public class D1335 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			char[][] matrix = new char[9][9];
			for (int i = 0; i < 9; i++) {
				matrix[i] = scanner.next().toCharArray();
			}
			
			matrix[0][0] = matrix[0][1];
			matrix[1][3] = matrix[1][4];
			matrix[2][6] = matrix[2][7];
			matrix[3][1] = matrix[3][2];
			matrix[4][4] = matrix[4][5];
			matrix[5][7] = matrix[5][8];
			matrix[6][2] = matrix[6][1];
			matrix[7][5] = matrix[7][4];
			matrix[8][8] = matrix[8][7];
			
			for (int i = 0; i < 9; i++) {
				System.out.println(matrix[i]);
			}
		}
		scanner.close();
	}
}
