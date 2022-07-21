package luyencode;

import java.util.Scanner;

public class VL13 {
	static String isPerfect(long n) {
		if (n <= 0) return "NO";
		long sum = 0;
		for (long i = n-1; i >= 1; i--) {
			if (n%i==0) sum += i;
			if (sum > n) return "NO";
		}
		if (sum == n) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Output
		System.out.println(isPerfect(n));
		
	}
}
