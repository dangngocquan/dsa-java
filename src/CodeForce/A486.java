package CodeForce;

import java.util.Scanner;

public class A486 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve
		long res = 0;
		if (n%2 == 0 ) {
			res = n/2;
		}else {
			res = - (n+1)/2;
		}
		//Output
		System.out.println(res);
	}
}
