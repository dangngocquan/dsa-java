package CodeForce;

import java.util.Scanner;

public class A749 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Output
		System.out.println(n/2);
		while (n> 3) {
			System.out.print("2 ");
			n -= 2;
		}
		System.out.println(n);
	}
}
