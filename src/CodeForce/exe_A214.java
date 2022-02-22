package CodeForce;

import java.util.Scanner;

public class exe_A214 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		//Solve
		int ans = 0;
		for (int i=0; i <= Math.sqrt(n); i++) {
			int b = n- i*i;
			ans += ((i+b*b)==m)? 1 : 0;
		}
		//Output
		System.out.println(ans);
	}
}
