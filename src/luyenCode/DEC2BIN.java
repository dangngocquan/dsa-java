package luyenCode;

import java.util.Scanner;

public class DEC2BIN {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			System.out.println(Long.toBinaryString(scanner.nextLong()));
		}
		scanner.close();
	}
}
