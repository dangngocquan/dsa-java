package luyencode;

import java.util.Scanner;

public class SUM4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			System.out.printf("%.8f\n",2.0 - 2.0/(n+1));
		}
		scanner.close();
	}
}
