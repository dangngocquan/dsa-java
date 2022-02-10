package CodeForce;

import java.util.Scanner;

public class exe_A1506 {
	public static void main(String[] args) {
		//Input
		Scanner scanner=  new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			long m = scanner.nextLong();
			long x = scanner.nextLong();
			long row = (x%n==0) ? n : x%n;
			long colum = (x%n==0) ? x/n : x/n +1;
			ans[i] = (row-1)*m+colum;
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
