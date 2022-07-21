package codeforces;

import java.util.Scanner;

public class A119 {
	static int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			}else {
				b -= a;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int turn = 1;
		while (n>0) {
			if (turn %2 == 1) {
				n -= gcd(a,n);
				turn++;
			}else {
				n -= gcd(b,n);
				turn++;
			}
		}
		//Output
		System.out.println(turn %2);
	}
}
