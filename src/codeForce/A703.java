package codeForce;

import java.util.Scanner;

public class A703 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int pointOfMishka = 0;
		int pointOfChris = 0;
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a>b) {
				pointOfMishka++;
			}else if (b > a) {
				pointOfChris++;
			}
		}
		scanner.close();
		//Solve + outout
		if (pointOfMishka==pointOfChris) {
			System.out.println("Friendship is magic!^^");
		}else if (pointOfMishka > pointOfChris) {
			System.out.println("Mishka");
		}else {
			System.out.println("Chris");
		}
	}
}
