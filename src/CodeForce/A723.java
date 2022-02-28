package CodeForce;

import java.util.Scanner;

public class A723 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		//Solve
		int res= Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
		//Output
		System.out.println(res);
	}
}
