package luyencode;

import java.util.Scanner;

public class VL19 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Output
		int count = 0;
		for (int i = b-1; i >= a+1; i--) {
			if (i % 3== 0) {
				count++;
				System.out.print(i + " ");
			}
		}
		if (count == 0) System.out.println("NOT FOUND");
	}
}
