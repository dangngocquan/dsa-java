package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1692/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:58:32 AM -  Jun 25, 2022
 */
public class C1692 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			scanner.nextLine();
			int r = 0;
			int c = 0;
			boolean isStarted = false;
			boolean isFinished = false;
			char[][] matrix = new char[8][8];
			for (int i = 0; i < 8; i++) {
				matrix[i] = scanner.next().toCharArray();
				int count = 0;
				for (int j = 0; j < 8; j++) {
					if (matrix[i][j] == '#') {
						if (!isFinished) {
							r = i+1;
							c = j+1;
						}
						count++;
					}
				}
				if (isStarted && count == 1) {
					isFinished = true;
				}
				if (count == 2) {
					isStarted = true;
				}
			}
			System.out.println(r + " " + c);
		}
		scanner.close();
	}
}
