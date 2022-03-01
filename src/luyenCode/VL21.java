package luyenCode;

import java.util.Scanner;

public class VL21 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve
		long x = 1;
		while ((x+1)*(x+2) <= 2*n) {
			x++;
		}
		//Output
		System.out.println(x);
	}
}
