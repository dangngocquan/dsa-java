package luyencode;

import java.util.Scanner;

public class PTTS {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve + Output
		long value = 2;
		do {
			long count = 0;
			for (long i = value; i <= Math.sqrt(n); i++) {
				if (n%i == 0) {
					value = i;
					while (n%i == 0) {
						count++;
						n /= i;
					}
					break;
				}
			}
			if (count == 0) {
				System.out.println(n + " " + 1);
				n = 1;
			}else {
				System.out.println(value + " " + count);
			}
		} while (n > 1);
	}
}
