package CodeForce;

import java.util.Scanner;

public class exe_A266 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		int res = 0;
		for (int i = 0; i < n-1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				res++;
			}
		}
		//Output
		System.out.println(res);
	}
}
