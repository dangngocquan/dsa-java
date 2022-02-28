package codeForce;

import java.util.Scanner;

public class A996 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int res = n/100;
		n %=100;
		res += n/20;
		n %= 20;
		res += n/10;
		n %= 10;
		res += n /5;
		n %= 5;
		res += n;
		//Output
		System.out.println(res);
	}
}
