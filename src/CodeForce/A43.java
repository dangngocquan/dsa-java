package CodeForce;

import java.util.Scanner;

public class A43 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String A = scanner.next();
		int countA = 1;
		String B = "";
		int countB = 0;
		for (int i = 1; i <= n-1; i++) {
			String x = scanner.next();
			if (x.equals(A)) {
				countA++;
			}else {
				B = x;
				countB++;
			}
		}
		scanner.close();
		//Output
		if (countA > countB) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}
}
