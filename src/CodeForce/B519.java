package CodeForce;

import java.util.Scanner;

public class B519 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long sum1 = 0;
		long sum2 = 0;
		long sum3 = 0;
		for (int i = 1; i <= n; i++) sum1 += scanner.nextLong();
		for (int i = 1; i <= n-1; i++) sum2 += scanner.nextLong();
		for (int i = 1; i <= n-2; i++) sum3 += scanner.nextLong();
		scanner.close();
		//output
		System.out.println(sum1-sum2);
		System.out.println(sum2 - sum3);
	}
}
