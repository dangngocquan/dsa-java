package luyencode;

import java.util.Scanner;

public class GPTB1 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		double a1 = scanner.nextDouble();
		double b1 = scanner.nextDouble();
		double c1 = scanner.nextDouble();
		double a2 = scanner.nextDouble();
		double b2 = scanner.nextDouble();
		double c2 = scanner.nextDouble();
		scanner.close();
		//Solve + output
		double D = a1*b2 - a2*b1;
		double Dx = c1*b2 - c2*b1;
		double Dy = a1*c2 - a2*c1;
		if (D == 0) {
			if (Dx == 0 && Dy == 0) {
				System.out.println("VOSONGHIEM");
			}else if (Dy != 0) {
				System.out.println("VONGHIEM");
			}else if (Dx != 0) {
				System.out.println("VONGHIEM");
			}
		}else {
			double x = (double)(Dx/D);
			double y = (double)(Dy/D);
			if (x == -0.0) x = Math.abs(x);
			if (y == -0.0) y = Math.abs(y);
			System.out.printf("%.2f %.2f",x,y);
		}
	}
}
