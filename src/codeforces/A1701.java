package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1701/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:23:11 AM -  Jul 23, 2022
 */
public class A1701 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int[][] field = new int[2][2];
			int count = 0;
			for (int i = 0; i < 2; i++) {
				for (int j  = 0; j < 2; j++) {
					field[i][j] = scanner.nextInt();
					if (field[i][j] == 1) {
						count++;
					}
				}
			}
			if (count == 0) {
				System.out.println(0);
			}else if (count == 4) {
				System.out.println(2);
			}else {
				System.out.println(1);
			}
		}
		scanner.close();
	}
}
