package codeForce;

import java.util.Scanner;

public class A466 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		int coins = 0;
		if (b <= m*a) {
			coins = (n/m)*b;
			n %= m ;
			if (n*a > b) {
				coins += b;
			}else {
				coins += n*a;
			}
		}else {
			coins = n*a;
		}
		//Output
		System.out.println(coins);
	}
}
