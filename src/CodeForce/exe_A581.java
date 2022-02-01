package CodeForce;

import java.util.Scanner;

public class exe_A581 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		int res1 = Math.min(a, b);
		int res2 = Math.abs(a-b)/2;
		//Output
		System.out.print(res1 + " ");
		System.out.println(res2);
	}
}
