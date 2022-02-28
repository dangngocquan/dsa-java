package CodeForce;

import java.util.Scanner;

public class A707 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String res = "#Black&White";
		for (int i = 0; i < n*m; i++) {
			String x = scanner.next();
			if (x.equals("C") || x.equals("M") || x.equals("Y")) res = "#Color";
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
