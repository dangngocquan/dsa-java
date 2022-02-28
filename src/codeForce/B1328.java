package codeForce;

import java.util.Scanner;

public class B1328 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] n = new long[t];
		long[] k = new long[t];
		for (int i = 0; i < t; i++) {
			n[i] = scanner.nextLong();
			k[i] = scanner.nextLong();
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i++) {
			long b1 = n[i]-1;
			long b2 = n[i];
			long x = (long)(Math.floor(Math.sqrt(2*k[i])));
			long k1 = x*(x+1)/2;
			if (k[i] <= k1){
				b1 = n[i]-x;
				b2 = b1+1+(k1-k[i]);
			}else {
				b1 = n[i]-x-1;
				b2 = n[i]+1 - (k[i] - k1);
			}
			for (long j = 1; j < b1; j++) System.out.print("a");
			System.out.print("b");
			for (long j = b1+1; j < b2; j++) System.out.print("a");
			System.out.print("b");
			for (long j = b2+1; j <= n[i]; j++) System.out.print("a");
			System.out.println();
		}
	}
}
