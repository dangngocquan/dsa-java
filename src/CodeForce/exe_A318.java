package CodeForce;

import java.util.Scanner;

public class exe_A318 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long k = scanner.nextLong();
		scanner.close();
		//Solve
		long res = 0;
		if (k>(n+1)/2) {
			res = (long)(2*(k-(n+1)/2));
		}else {
			res = (long)(2*k -1);
		}
		//Output
		System.out.println(res);
	}
}
