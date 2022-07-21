package luyencode;

import java.util.Scanner;

public class CB07 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		scanner.close();
		//Output
		System.out.printf("%.3f ",2*3.14*r);
		System.out.printf("%.3f",3.14*r*r);
	}
}
