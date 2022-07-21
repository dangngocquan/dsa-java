package luyencode;

import java.util.Scanner;

public class CB05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextInt() % scanner.nextInt());
		scanner.close();
	}
}
