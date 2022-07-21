package codeforces;

import java.util.Scanner;

public class B478 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		scanner.close();
		//Solve
		long min = 0;
		if (n%m==0) {
			min = m*(n/m)*(n/m-1)/2;
		}else {
			long k1 = n/m + 1;
			long k2 = k1*m-n;
			min = k2*(k1-1)*(k1-2)/2 + (m-k2)*(k1)*(k1-1)/2;
		}
		long max = (n-m+1)*(n-m)/2;
		//Output
		System.out.println(min + " " + max);
	}
}
