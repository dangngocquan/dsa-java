package luyenCode;

import java.util.Scanner;

public class VT06 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (x % 2 != 0) {
				count++;
				sum += x;
			}
		}
		scanner.close();
		//Output
		System.out.printf("%.4f",sum*1.0/count);
	}
}
