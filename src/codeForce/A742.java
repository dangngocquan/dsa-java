package codeForce;

import java.util.Scanner;

public class A742 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Output
		if (n == 0) {
			System.out.println(1);
		}else {
			int x = n%4;
			switch (x) {
			case 1:
				System.out.println(8);
				break;
			case 2:
				System.out.println(4);
				break;
			case 3:
				System.out.println(2);
				break;
			case 0:
				System.out.println(6);
			}
		}
	}
}
