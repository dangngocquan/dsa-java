package codeforces;

import java.util.Scanner;

public class B1647 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			char[][] matrix = new char[n][m];
			for (int i = 0; i < n; i++) {
				matrix[i] = scanner.next().toCharArray();
			}
			if (n == 1 || m == 1) {
				System.out.println("YES");
				continue;
			}
			String ans = "YES";
			for (int i = 0; i < n-1; i++) {
				for (int j = 0; j < m-1; j++) {
					if (matrix[i][j] == '1' && matrix[i+1][j] == '1' && matrix[i][j+1] == '1' && matrix[i+1][j+1] == '0') {
						ans = "NO";
					}else if (matrix[i][j] == '1' && matrix[i+1][j] == '1' && matrix[i][j+1] == '0' && matrix[i+1][j+1] == '1') {
						ans = "NO";
					}else if (matrix[i][j] == '1' && matrix[i+1][j] == '0' && matrix[i][j+1] == '1' && matrix[i+1][j+1] == '1') {
						ans = "NO";
					}else if (matrix[i][j] == '0' && matrix[i+1][j] == '1' && matrix[i][j+1] == '1' && matrix[i+1][j+1] == '1') {
						ans = "NO";
					}
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
