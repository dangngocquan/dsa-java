package luyencode;

import java.util.Scanner;

public class DK08 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		String op = scanner.next();
		double b = scanner.nextDouble();
		scanner.close();
		//Solve
		if (op.equals("+")) {
			System.out.printf("%.2f",(a+b));
		}else if (op.equals("-")) {
			System.out.printf("%.2f",(a-b));
		}else if (op.equals("*")) {
			System.out.printf("%.2f",(a*b));
		}else {
			if (b==0) {
				System.out.println("Math Error");
			}else {
				System.out.printf("%.2f",(a/b));
			}
		}
		
	}
}
