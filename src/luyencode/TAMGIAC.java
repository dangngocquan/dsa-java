package luyencode;

import java.util.Scanner;

public class TAMGIAC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		scanner.close();
		if (a + b <= c || b + c <= a || c + a <= b) {
			System.out.println("NO");
			return;
		}
		long C = a + b + c;
		double p = (a+b+c)*1.0/2;
		double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.printf("%d %.2f", C, S);
	}
}
