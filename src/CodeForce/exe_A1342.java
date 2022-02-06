package CodeForce;

import java.util.Scanner;

public class exe_A1342 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] res = new long[t];
		for (int i = 0; i < t; i++) {
			long x = scanner.nextLong();
			long y = scanner.nextLong();
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			if (a*2 <= b) {
				res[i] = a*(x+y);
			}else {
				res[i] = Math.min(x, y)*b + (Math.abs(x- y))*a;
			}
		}
		scanner.close();
		//Output
		for (long i: res) System.out.println(i);
	}
}
