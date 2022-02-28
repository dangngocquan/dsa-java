package codeForce;

import java.util.Scanner;

public class B200 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scanner.nextInt();
		}
		scanner.close();
		//Output
		System.out.println((double)(sum*1.0/n));
	}
}
