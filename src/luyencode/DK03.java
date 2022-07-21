package luyencode;

import java.util.Scanner;

public class DK03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(Math.abs(scanner.nextInt() - scanner.nextInt()));
		scanner.close();
	}
}
