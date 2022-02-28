package CodeForce;

import java.util.Scanner;

public class A599 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int d1 = scanner.nextInt();
		int d2 = scanner.nextInt();
		int d3 = scanner.nextInt();
		scanner.close();
		//Solve
		int ans = d1 + d2 + d3;
		ans = Math.min(2*d1+2*d2, ans);
		ans = Math.min(2*d1+2*d3, ans);
		ans = Math.min(2*d2+2*d3, ans);
		//Output
		System.out.println(ans);
	}
}
