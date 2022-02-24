package Luyencode;

import java.util.Scanner;

public class exe_PTTS {
	static boolean isPrime(long n) {
		if (n==1) return false;
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve + Output
		if (isPrime(n)) {
			System.out.println(n + " " + 1);
			n /= n;
		}
		for (long i = 2; i <= Math.sqrt(n); i++) {
			long count = 0;
			while (n%i==0){
				count++;
				n /= i;
			}
			if (count > 0) 	{
				System.out.println(i + " " + count);
				if (isPrime(n)) {
					System.out.println(n + " " +1);
					n /= n;
				}
			}
		}
	}
}
