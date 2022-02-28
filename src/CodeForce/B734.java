package CodeForce;

import java.util.Scanner;

public class B734 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int k2 = scanner.nextInt();
		int k3 = scanner.nextInt();
		int k5 = scanner.nextInt();
		int k6 = scanner.nextInt();
		scanner.close();
		//Solve
		int sum = 0;
		int min1 = Math.min(k5, k6);
		min1 = Math.min(min1, k2);
		int min2 = Math.min(k3, k2-min1);
		sum = 32*min2 + 256*min1;
		//Output
		System.out.println(sum);
	}
}
