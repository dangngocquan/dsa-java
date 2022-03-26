package other.test;
// solve Sudoku
public class Test020 {
	public static void printSudoku(int[][] sudoku) {
		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				System.out.printf("%2d", sudoku[row][column]);
			}
			System.out.println();
		}
	}
	
	public static boolean isValid(int[][] sudoku, int rowChecking, int columnChecking, int value) {
		for (int column = 0; column < 9; column++) {
			if (sudoku[rowChecking][column] == value) {
				return false;
			}
		}
		
		for (int row = 0; row < 9; row++) {
			if (sudoku[row][columnChecking] == value) {
				return false;
			}
		}
		
		rowChecking = (rowChecking/3)*3;
		columnChecking = (columnChecking/3)*3;
		
		for (int row = rowChecking; row < rowChecking + 3; row++) {
			for (int column = columnChecking; column < columnChecking + 3; column++) {
				if (sudoku[row][column] == value) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean solve(int[][] sudoku) {
		int emptyRow = -1;
		int emptyColumn = -1;
		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				if (sudoku[row][column] == 0) {
					emptyRow = row;
					emptyColumn = column;
					break;
				}
			}
			if (emptyColumn > - 1) {
				break;
			}
		}
		if (emptyRow == -1) {
			return true;
		}
		
		for (int value = 1; value <= 9; value++) {
			if (isValid(sudoku, emptyRow, emptyColumn, value)) {
				sudoku[emptyRow][emptyColumn] = value;
				if (solve(sudoku)) {
					return true;
				}else {
					sudoku[emptyRow][emptyColumn] = 0;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[][] sudoku = {
				{2, 0, 0, 0, 0, 0, 0, 0, 8},
				{0, 0, 0, 0, 0, 0, 0, 0 ,0},
				{0, 0, 3, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0 ,0},
				{0, 0, 0, 0, 5, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0 ,0},
				{0, 0, 0, 0, 0, 0, 7, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0 ,0},
				{0, 0, 0, 0, 0, 0, 0, 0, 9},
		};
		
		printSudoku(sudoku);
		
		solve(sudoku);
		
		System.out.println();
		printSudoku(sudoku);
		
	}
}
