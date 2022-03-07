package other.test;

import java.util.Scanner;

public class Test010 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long L = scanner.nextLong();
		long R = scanner.nextLong();
		scanner.close();
		//Solve
		long ans = 0;
		for (long i = L; i <= R; i++) {
			long sum = 0;
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					sum += j;
				}
			}
			if (sum > i) ans++;
		}
		//Output
		System.out.println(ans);
	}
}
