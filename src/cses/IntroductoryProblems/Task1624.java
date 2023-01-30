package cses.IntroductoryProblems;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 10:13:36 PM - Jan 20, 2023
 *
 */
public class Task1624 {
	public static long counter;
	public static char[][] matrix;
	
	public static void finding(int indexQueen) {
		if (indexQueen == 8) {
			counter++;
		}else {
			for (int indexCol = 0; indexCol < 8; indexCol++) {
				if (matrix[indexQueen][indexCol] == '.') {
					// Copy matrix
					char[][] matrixBackup = new char[8][8];
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
							matrixBackup[i][j] = matrix[i][j];
						}
					}
					
					// Fill *
					for (int i = 0; i < 8; i++) {
						matrix[indexQueen][i] = '*';
						matrix[i][indexCol] = '*';
						
						int indexRow = indexQueen - i;
						int indexColumn = indexCol - i;
						if (indexRow >= 0 && indexColumn >= 0) {
							matrix[indexRow][indexColumn] = '*';
						}
						
						indexRow = indexQueen - i;
						indexColumn = indexCol + i;
						if (indexRow >= 0 && indexColumn <= 7) {
							matrix[indexRow][indexColumn] = '*';
						}
						
						indexRow = indexQueen + i;
						indexColumn = indexCol - i;
						if (indexRow <= 7 && indexColumn >= 0) {
							matrix[indexRow][indexColumn] = '*';
						}
						
						indexRow = indexQueen + i;
						indexColumn = indexCol + i;
						if (indexRow <= 7 && indexColumn <= 7) {
							matrix[indexRow][indexColumn] = '*';
						}
					}
					
					// continue find
					finding(indexQueen+1);
					
					// Backup
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
							matrix[i][j] = matrixBackup[i][j];
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		counter = 0;
		matrix = new char[8][8];
		for (int i =0 ; i < 8; i++) {
			matrix[i] = scanner.next().toCharArray();
		}
		finding(0);
		System.out.println(counter);
		scanner.close();
	}
}
