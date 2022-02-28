package CodeForce;

import java.util.Scanner;

public class A1196 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		long[] ans = new long[q];
		for (int i = 0; i < q; i++) {	
			ans[i] = scanner.nextLong() + scanner.nextLong() + scanner.nextLong();
			ans[i] /= 2;
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
