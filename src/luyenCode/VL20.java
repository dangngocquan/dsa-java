package luyenCode;

import java.util.Scanner;

public class VL20 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		char char1 = scanner.next().toUpperCase().charAt(0);
		char char2 = scanner.next().toUpperCase().charAt(0);
		scanner.close();
		//Output
		for (char i = char1; i <= char2; i++) {
			System.out.print(i + " ");
		}
	}
}
