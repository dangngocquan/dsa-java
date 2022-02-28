package CodeForce;

import java.util.Scanner;

public class A124 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		int ans = n- Math.max(a, n-b-1);
		// >= a+1
		// >= n-b
		//Output
		System.out.println(ans);
	}
}
