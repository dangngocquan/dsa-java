package luyencode;

import java.util.Scanner;

public class VL11 {
	static String isPrime(long n) {
		if (n<= 1) return "NO";
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) return "NO";
		}
		return "YES";
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Output
		System.out.println(isPrime(n));
	}
}
