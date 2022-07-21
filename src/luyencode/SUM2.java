package luyencode;

import java.util.Scanner;

public class SUM2 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve
		long sum = n*(n+1)*(n+2)/3 - n*(n+1)/2;
		//Output
		System.out.println(sum);
	}
}
