package ntucoder;

import java.util.Scanner;

/**
 * <a href = "http://ntucoder.net/Problem/Details/5680"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:33:21 AM -  Jul 17, 2022
 */
public class WORDGAME {
	public static int m, n, d;
	public static String word;
	public static char[][] board;
	public static int count = 0;
	public static StringBuilder temp = new StringBuilder("");

	public static void dfs(int k, int row, int column) {
		if (k == m + n) {
			if (temp.toString().contains(word)) {
				count++;
				count %= d;
			}
			return;
		}
		if (row == board.length - 1) {
			temp.append(board[row][column]);
			dfs(k+1, row, column + 1);
			temp.deleteCharAt(temp.length()-1);
		}else if (column == board[0].length - 1) {
			temp.append(board[row][column]);
			dfs(k+1, row+1, column);
			temp.deleteCharAt(temp.length()-1);
		}else {
			temp.append(board[row][column]);
			dfs(k+1, row, column + 1);
			dfs(k+1, row+1, column);
			temp.deleteCharAt(temp.length()-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		m = scanner.nextInt();
		n = scanner.nextInt();
		d = scanner.nextInt();
		word = scanner.next();
		board = new char[m][n];
		for (int i = 0; i < m; i++) {
			board[i] = scanner.next().toCharArray();
		}
		scanner.close();
		
		dfs(1, 0, 0);
		System.out.println(count);
	}
}
