package luyencode;

import java.util.Scanner;

public class DT1 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		//Solve
		double area = Math.PI*a*a*1.0/2;
		//Output
		System.out.printf("%.3f",area);
	}
}
