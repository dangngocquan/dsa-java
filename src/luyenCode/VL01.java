package luyenCode;

import java.util.Scanner;

public class VL01 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Output
		for (int i = a; i <= b; i++) System.out.print(i+ " ");
	}
}
