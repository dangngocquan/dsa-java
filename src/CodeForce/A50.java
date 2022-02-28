package CodeForce;

import java.util.Scanner;

public class A50 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		long res = 0;
		if (n*m%2==0) {
			res = (long)(n*m/2);
		}else {
			res = (long)(n*(m/2) + n/2);
		}
		//Output
		System.out.println(res);
	}
}
