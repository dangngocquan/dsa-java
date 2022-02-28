package codeForce;

import java.util.Scanner;

public class A472 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int x = 0;
		int y = 0;
		if (n%2==0) {
			x = 4;
			y = n-4;
		}else {
			if (n%3==0) {
				x = 6;
				y = n -6;
			}else if (n%3 == 1) {
				x = 4;
				y = n-4;
			}else {
				x = 8;
				y = n-8;
			}
		}
		//Output
		System.out.print(x + " " + y );
	}
}
