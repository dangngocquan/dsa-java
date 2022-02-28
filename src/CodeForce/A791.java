package CodeForce;

import java.util.Scanner;

public class A791 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		while (a <= b) {
			res++;
			a *= 3;
			b *= 2;
		}
		//Output
		System.out.println(res);
	}
}
