package luyenCode;

import java.util.Scanner;

public class SUM3 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Output
		System.out.printf("%.5f",n*1.0/(n+1));
	}
}
