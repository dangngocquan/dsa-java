package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 12:57:29 PM - Jan 21, 2023
 *
 */
public class Task1625 {
	public static char[] defaultPath;
	public static boolean[][] isUsed;
	public static int counter = 0;
	
	
	
	public static void solve(int indexChar, int indexRow, int indexColumn) {
		if (indexRow == 8 && indexColumn == 2) {
			if (indexChar == 48) {
				counter++;
			}
		}else {
			// Find correct way: 'D', 'U', 'L', 'R'
			char correctWay = '?';
			// (1)			(1)
			//  0 1   or   1 0
			//  1			 1
			if ((isUsed[indexRow+1][indexColumn+1] || isUsed[indexRow+1][indexColumn-1])
					&& isUsed[indexRow+2][indexColumn] && !isUsed[indexRow+1][indexColumn]) {
				correctWay = 'D';
			}
			//  1 			 1 
			//  0 1   or   1 0
			// (1)			(1)
			else if ((isUsed[indexRow-1][indexColumn+1] || isUsed[indexRow-1][indexColumn-1])
					&& !isUsed[indexRow-1][indexColumn] && isUsed[indexRow-2][indexColumn]) {
				correctWay = 'U';
			}
			// 1 0 (1)   or    1
			//   1			 1 0 (1)
			else if ((isUsed[indexRow+1][indexColumn-1] || isUsed[indexRow-1][indexColumn-1])
					&& !isUsed[indexRow][indexColumn-1] && isUsed[indexRow][indexColumn-2]) {
				correctWay = 'L';
			}
			//(1) 0 1    or      1
			//    1		     (1) 0 1
			else if ((isUsed[indexRow+1][indexColumn+1] || isUsed[indexRow-1][indexColumn+1])
					&& !isUsed[indexRow][indexColumn+1] && isUsed[indexRow][indexColumn+2]) {
				correctWay = 'R';
			}
			
			// Check input path (default path)
			char c = defaultPath[indexChar];
			if (c == '?') {
				if (correctWay == '?') {
					// 'D'
					if (!isUsed[indexRow+1][indexColumn]) {
						isUsed[indexRow+1][indexColumn] = true;
						solve(indexChar+1, indexRow+1, indexColumn);
						isUsed[indexRow+1][indexColumn] = false;
					}
					// 'U'
					if (!isUsed[indexRow-1][indexColumn]) {
						isUsed[indexRow-1][indexColumn] = true;
						solve(indexChar+1, indexRow-1, indexColumn);
						isUsed[indexRow-1][indexColumn] = false;
					}
					// 'L'
					if (!isUsed[indexRow][indexColumn-1]) {
						isUsed[indexRow][indexColumn-1] = true;
						solve(indexChar+1, indexRow, indexColumn-1);
						isUsed[indexRow][indexColumn-1] = false;
					}
					// 'R'
					if (!isUsed[indexRow][indexColumn+1]) {
						isUsed[indexRow][indexColumn+1] = true;
						solve(indexChar+1, indexRow, indexColumn+1);
						isUsed[indexRow][indexColumn+1] = false;
					}
				}else {
					if (correctWay == 'D') {
						isUsed[indexRow+1][indexColumn] = true;
						solve(indexChar+1, indexRow+1, indexColumn);
						isUsed[indexRow+1][indexColumn] = false;
					}else if (correctWay == 'U') {
						isUsed[indexRow-1][indexColumn] = true;
						solve(indexChar+1, indexRow-1, indexColumn);
						isUsed[indexRow-1][indexColumn] = false;
					}else if (correctWay == 'L') {
						isUsed[indexRow][indexColumn-1] = true;
						solve(indexChar+1, indexRow, indexColumn-1);
						isUsed[indexRow][indexColumn-1] = false;
					}else if (correctWay == 'R') {
						isUsed[indexRow][indexColumn+1] = true;
						solve(indexChar+1, indexRow, indexColumn+1);
						isUsed[indexRow][indexColumn+1] = false;
					}
				}
			}else {
				if (c == correctWay || correctWay == '?') {
					if (c == 'D' && !isUsed[indexRow+1][indexColumn]) {
						isUsed[indexRow+1][indexColumn] = true;
						solve(indexChar+1, indexRow+1, indexColumn);
						isUsed[indexRow+1][indexColumn] = false;
					}else if (c == 'U' && !isUsed[indexRow-1][indexColumn]) {
						isUsed[indexRow-1][indexColumn] = true;
						solve(indexChar+1, indexRow-1, indexColumn);
						isUsed[indexRow-1][indexColumn] = false;
					}else if (c == 'L' && !isUsed[indexRow][indexColumn-1]) {
						isUsed[indexRow][indexColumn-1] = true;
						solve(indexChar+1, indexRow, indexColumn-1);
						isUsed[indexRow][indexColumn-1] = false;
					}else if (c == 'R' && !isUsed[indexRow][indexColumn+1]) {
						isUsed[indexRow][indexColumn+1] = true;
						solve(indexChar+1, indexRow, indexColumn+1);
						isUsed[indexRow][indexColumn+1] = false;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		defaultPath = scanner.next().toCharArray();
		isUsed = new boolean[11][11];
		for (int i = 0; i < 11; i++) {
			isUsed[0][i] = true;
			isUsed[1][i] = true;
			isUsed[9][i] = true;
			isUsed[10][i] = true;
			isUsed[i][0] = true;
			isUsed[i][1] = true;
			isUsed[i][9] = true;
			isUsed[i][10] = true;
		}
		isUsed[2][2] = true;
		isUsed[8][1] = false;
		isUsed[9][2] = false;
		solve(0, 2, 2);
	
		System.out.println(counter);
		scanner.close();
	}
}
