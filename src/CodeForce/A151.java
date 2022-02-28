package CodeForce;

import java.util.Scanner;

public class A151 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int l = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int p = scanner.nextInt();
		int nl = scanner.nextInt();
		int np = scanner.nextInt();
		scanner.close();
		//Solve
		int res = (Math.min(Math.min(k*l/nl, c*d), p/np))/n;
		//Output
		System.out.println(res);
	}
}
