package CodeForce;

import java.util.Scanner;

public class exe_A451 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		//Solve
		int res = Math.min(n, m);
		//Output
		if (res %2 == 0) {
			System.out.println("Malvika");
		}else {
			System.out.println("Akshat");
		}
	}
}
