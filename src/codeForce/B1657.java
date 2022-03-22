package codeForce;

import java.util.Scanner;

public class B1657 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			long n = scanner.nextLong();
			long B = scanner.nextLong();
			long x = scanner.nextLong();
			long y = scanner.nextLong();
			long tempValue = 0;
			long sum = 0;
			for (int i = 0; i < n; i++) {
				if (tempValue + x <= B) {
					tempValue += x;
				}else {
					tempValue -= y;
				}
				sum += tempValue;
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}
