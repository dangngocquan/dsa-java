package luyenCode;

import java.util.Scanner;

public class VL03 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Output
		System.out.println((n-1)*(n+2)/2 + 2*n);
	}
}
