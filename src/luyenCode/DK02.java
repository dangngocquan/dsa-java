package luyenCode;

import java.util.Scanner;

public class DK02 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println(Math.max(Math.max(scanner.nextInt(), scanner.nextInt()),scanner.nextInt()));
		scanner.close();
	}
}
