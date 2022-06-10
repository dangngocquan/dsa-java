package other.test;

import java.util.Scanner;

public class Test032 {
	public static int[][] getInput(int rows, int columns) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] = scanner.nextInt();
			}
		}
		scanner.close();
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%7d", matrix[row][column]);
			}
			System.out.println();
		}
	}
	
	public static int indexOfSecondMaxRow(int[][] matrix) {
		int[] sumOfRow = new int[matrix.length];
		int maxRow = Integer.MIN_VALUE;
		for (int row = 0; row < sumOfRow.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				sumOfRow[row] += matrix[row][column];
			}
			maxRow = Math.max(maxRow, sumOfRow[row]);
		}
		
		int secondMaxRow = Integer.MIN_VALUE;
		for (int row = 0; row < sumOfRow.length; row++) {
			if (sumOfRow[row] < maxRow) {
				secondMaxRow = Math.max(secondMaxRow, sumOfRow[row]);
			}
		}
		
		for (int row = 0; row < sumOfRow.length; row++) {
			if (sumOfRow[row] == secondMaxRow) {
				return row;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int numberOfRow = 3;
		int numberOfColumn = 3;
		int[][] matrix = new int[numberOfRow][numberOfColumn];
		matrix = getInput(numberOfRow, numberOfColumn);
		printMatrix(matrix);
		System.out.println("Index of second max row: " + indexOfSecondMaxRow(matrix));
	}
}
