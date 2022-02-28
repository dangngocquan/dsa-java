package luyenCode;

import java.util.Scanner;

public class SUM1 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Output
		System.out.println(n*(n+1)/2);
	}
}
