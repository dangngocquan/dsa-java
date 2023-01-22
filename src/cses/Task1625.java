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
	
	public static boolean checkDead(int indexRow, int indexColumn) {
		// 0 (1)
		// 1  0
		if (indexRow < 6 && indexColumn > 0) {
			if (!isUsed[indexRow][indexColumn-1] && isUsed[indexRow][indexColumn]
					&& isUsed[indexRow+1][indexColumn-1] && !isUsed[indexRow+1][indexColumn]) {
				return true;
			}
		}
		// (1) 0
		//  0  1
		if (indexRow < 6 && indexColumn < 6) {
			if (isUsed[indexRow][indexColumn] && !isUsed[indexRow][indexColumn+1]
					&& !isUsed[indexRow+1][indexColumn] && isUsed[indexRow+1][indexColumn+1]) {
				return true;
			}
		}
		//  0  1
		// (1) 0
		if (indexRow > 0 && indexColumn < 6) {
			if (!isUsed[indexRow-1][indexColumn] && isUsed[indexRow-1][indexColumn+1]
					&& isUsed[indexRow][indexColumn] && !isUsed[indexRow][indexColumn+1]) {
				return true;
			}
		}
		// 1  0
		// 0 (1)
		if (indexRow > 0 && indexColumn > 0) {
			if (isUsed[indexRow-1][indexColumn-1] && !isUsed[indexRow-1][indexColumn]
					&& !isUsed[indexRow][indexColumn-1] && isUsed[indexRow][indexColumn]) {
				return true;
			}
		}
		
		
		
		if (indexRow < 5 && indexColumn > 1) {
			// 1 1 (1)
			// 1 0
			// 1 1
			if ((isUsed[indexRow][indexColumn-2]) && (isUsed[indexRow][indexColumn-1])
					&& (isUsed[indexRow+1][indexColumn-2]) && (!isUsed[indexRow+1][indexColumn-1])
					&& (isUsed[indexRow+2][indexColumn-2]) && (isUsed[indexRow+2][indexColumn-1])
					) {
				return true;
			}
			//     (1)
			// 1 0  1
			// 1 1  1
			if ((isUsed[indexRow+1][indexColumn-2]) && (!isUsed[indexRow+1][indexColumn-1]) && (isUsed[indexRow+1][indexColumn])
					&& (isUsed[indexRow+1][indexColumn-2]) && (isUsed[indexRow+1][indexColumn-1]) && (isUsed[indexRow+1][indexColumn])
					) {
				return true;
			}
		}
		if (indexRow < 5 && indexColumn < 5) {
			// (1) 1 1
			//     0 1
			//     1 1
			if ((isUsed[indexRow][indexColumn+1]) && (isUsed[indexRow][indexColumn+2])
					 && (!isUsed[indexRow+1][indexColumn+1]) && (isUsed[indexRow+1][indexColumn+2])
					 && (isUsed[indexRow+2][indexColumn+1]) && (isUsed[indexRow+2][indexColumn+2])
					) {
				return true;
			}
			// (1)
			//  1  0 1
			//  1  1 1
			if ((isUsed[indexRow+1][indexColumn]) && (!isUsed[indexRow+1][indexColumn+1]) && (isUsed[indexRow+1][indexColumn+2])
					&& (isUsed[indexRow+2][indexColumn]) && (isUsed[indexRow+2][indexColumn+1]) && (isUsed[indexRow+2][indexColumn+2])
					) {
				return true;
			}
		}
		if (indexRow > 1 && indexColumn < 5) {
			//  1  1  1
			//  1  0  1
			// (1)
			if ((isUsed[indexRow-2][indexColumn]) && (isUsed[indexRow-2][indexColumn+1]) && (isUsed[indexRow-2][indexColumn+2])
					&& (isUsed[indexRow-1][indexColumn]) && (!isUsed[indexRow-1][indexColumn+1]) && (isUsed[indexRow-1][indexColumn+2])
					) {
				return true;
			}
			//     1  1
			//     0  1
			// (1) 1  1
			if ((isUsed[indexRow-2][indexColumn+1]) && (isUsed[indexRow-2][indexColumn+2])
					&& (!isUsed[indexRow-1][indexColumn+1]) && (isUsed[indexRow-1][indexColumn+2])
					&& (isUsed[indexRow][indexColumn+1]) && (isUsed[indexRow][indexColumn+2])
					) {
				return true;
			}
		}
		if (indexRow > 1 && indexColumn > 1) {
			//  1  1  1
			//  1  0  1
			//       (1)
			if ((isUsed[indexRow-2][indexColumn-2]) && (isUsed[indexRow-2][indexColumn-1]) && (isUsed[indexRow-2][indexColumn])
					&& (isUsed[indexRow-1][indexColumn-2]) && (!isUsed[indexRow-1][indexColumn-1]) && (isUsed[indexRow-1][indexColumn])
					) {
				return true;
			}
			//  1  1  
			//  1  0  
			//  1  1 (1)
			if ((isUsed[indexRow-2][indexColumn-2]) && (isUsed[indexRow-2][indexColumn-1]) 
					&& (isUsed[indexRow-1][indexColumn-2]) && (!isUsed[indexRow-1][indexColumn-1])
					&& (isUsed[indexRow][indexColumn-2]) && (isUsed[indexRow][indexColumn-1]) 
					) {
				return true;
			}
		}
		
		if (indexRow < 6 && indexColumn > 2) {
			// 1 0 1 (1)
			// 1 1 1
			if (isUsed[indexRow][indexColumn-3] && !isUsed[indexRow][indexColumn-2] && isUsed[indexRow][indexColumn-1]
					&& isUsed[indexRow+1][indexColumn-3] && isUsed[indexRow+1][indexColumn-2] && isUsed[indexRow+1][indexColumn-1]) {
				return true;
			}
		}
		if (indexRow < 4 && indexColumn > 0) {
			//   (1)
			// 1  1
			// 1  0
			// 1  1
			if (isUsed[indexRow+1][indexColumn-1] && isUsed[indexRow+1][indexColumn]
					&& isUsed[indexRow+2][indexColumn-1] && !isUsed[indexRow+2][indexColumn] 
					&& isUsed[indexRow+3][indexColumn-1] && isUsed[indexRow+3][indexColumn]) {
				return true;
			}
		}
		if (indexRow < 6 && indexColumn < 4) {
			//(1) 1 0 1 
			//    1 1 1
			if (isUsed[indexRow][indexColumn+1] && !isUsed[indexRow][indexColumn+2] && isUsed[indexRow][indexColumn+3]
					&& isUsed[indexRow+1][indexColumn+1] && isUsed[indexRow+1][indexColumn+2] && isUsed[indexRow+1][indexColumn+3]) {
				return true;
			}
		}
		if (indexRow < 4 && indexColumn < 6) {
			//(1)
			// 1  1
			// 0  1
			// 1  1
			if (isUsed[indexRow+1][indexColumn] && isUsed[indexRow+1][indexColumn+1]
					&& !isUsed[indexRow+2][indexColumn] && isUsed[indexRow+2][indexColumn+1] 
					&& isUsed[indexRow+3][indexColumn] && isUsed[indexRow+3][indexColumn+1]) {
				return true;
			}
		}
		if (indexRow > 0 && indexColumn < 4) {
			// 	   1 1 1 
			// (1) 1 0 1
			if (isUsed[indexRow-1][indexColumn+1] && isUsed[indexRow-1][indexColumn+2] && isUsed[indexRow-1][indexColumn+3]
					&& isUsed[indexRow][indexColumn+1] && !isUsed[indexRow][indexColumn+2] && isUsed[indexRow][indexColumn+3]) {
				return true;
			}
		}
		if (indexRow > 2 && indexColumn < 6) {
			// 1  1
			// 0  1
			// 1  1
			//(1)
			if (isUsed[indexRow-3][indexColumn] && isUsed[indexRow-3][indexColumn+1]
					&& !isUsed[indexRow-2][indexColumn] && isUsed[indexRow-2][indexColumn+1] 
					&& isUsed[indexRow-1][indexColumn] && isUsed[indexRow-1][indexColumn+1]) {
				return true;
			}
		}
		if (indexRow > 0 && indexColumn > 2) {
			// 	1 1 1 
			//  1 0 1 (1)
			if (isUsed[indexRow-1][indexColumn-3] && isUsed[indexRow-1][indexColumn-2] && isUsed[indexRow-1][indexColumn-1]
					&& isUsed[indexRow][indexColumn-3] && !isUsed[indexRow][indexColumn-2] && isUsed[indexRow][indexColumn-1]) {
				return true;
			}
		}
		if (indexRow > 2 && indexColumn > 0) {
			// 1  1
			// 1  0
			// 1  1
			//	 (1)
			if (isUsed[indexRow-3][indexColumn-1] && isUsed[indexRow-3][indexColumn]
					&& isUsed[indexRow-2][indexColumn-1] && !isUsed[indexRow-2][indexColumn] 
					&& isUsed[indexRow-1][indexColumn-1] && isUsed[indexRow-1][indexColumn]) {
				return true;
			}
		}
		
		return false;	
	}
	
	public static void solve(int indexChar, int indexRow, int indexColumn) {
		if (indexChar == 48 && indexRow == 6 && indexColumn == 0) {
			counter++;
		}else {
			if (indexRow == 1 && indexColumn == 2) {
				if (isUsed[1][0] && isUsed[1][1] && isUsed[1][2] && !isUsed[0][1]) {
					return;
				}
			}
			if (indexRow == 2 && indexColumn == 1) {
				if (isUsed[0][1] && isUsed[1][1] && isUsed[2][1] && !isUsed[1][0]) {
					return;
				}
			}
			if (checkDead(indexRow, indexColumn)) {
				return;
			}
			if (indexRow == 6 && indexColumn < 6 && !isUsed[indexRow][indexColumn+1]) {
				return;
			}
			if (indexRow == 0 && indexColumn > 0 && !isUsed[indexRow][indexColumn-1]) {
				return;
			}
			if (indexColumn == 6 && indexRow > 0 && !isUsed[indexRow-1][indexColumn]) {
				return;
			}
			if (indexColumn == 0 && indexRow > 0 && !isUsed[indexRow-1][indexColumn]) {
				return;
			}
			
			if (defaultPath[indexChar] == 'D' || defaultPath[indexChar] == '?') {
				if (indexRow < 6 && !isUsed[indexRow+1][indexColumn]) {
					isUsed[indexRow+1][indexColumn] = true;
					solve(indexChar+1, indexRow+1, indexColumn);
					isUsed[indexRow+1][indexColumn] = false;
				}
			}
			if (defaultPath[indexChar] == 'U' || defaultPath[indexChar] == '?') {
				if (indexRow > 0 && !isUsed[indexRow-1][indexColumn]) {
					isUsed[indexRow-1][indexColumn] = true;
					solve(indexChar+1, indexRow-1, indexColumn);
					isUsed[indexRow-1][indexColumn] = false;
				}
			}
			if (defaultPath[indexChar] == 'L' || defaultPath[indexChar] == '?') {
				if (indexColumn > 0 && !isUsed[indexRow][indexColumn-1]) {
					isUsed[indexRow][indexColumn-1] = true;
					solve(indexChar+1, indexRow, indexColumn-1);
					isUsed[indexRow][indexColumn-1] = false;
				}
			}
			if (defaultPath[indexChar] == 'R' || defaultPath[indexChar] == '?') {
				if (indexColumn < 6 && !isUsed[indexRow][indexColumn+1]) {
					isUsed[indexRow][indexColumn+1] = true;
					solve(indexChar+1, indexRow, indexColumn+1);
					isUsed[indexRow][indexColumn+1] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		defaultPath = scanner.next().toCharArray();
		isUsed = new boolean[7][7];
		isUsed[0][0] = true;
		solve(0, 0, 0);
	
		System.out.println(counter);
		scanner.close();
	}
}
