package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1674/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:45:32 PM -  May 2, 2022
 */
public class B1674 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[][] matrix = new int[26][26];
		int tempIndex = 1;
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				if (i != j) {
					matrix[i][j] = tempIndex;
					tempIndex++;
				}
			}
		}
		
		while (t-->0) {
			String s = scanner.next();
			System.out.println(matrix[s.charAt(0) - 'a'][s.charAt(1) - 'a']);
		}
		scanner.close();
	}
}
