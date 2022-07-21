package luyencode;

import java.util.Scanner;

public class SUMDIV {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			long n = scanner.nextLong();
			long sum = 0;
			for (long i = 1; i <= Math.sqrt(n); i++) {
				if (n % i== 0) {
					long x = n/i;
					sum += i;
					if (x != i) sum += x;
				}
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}
