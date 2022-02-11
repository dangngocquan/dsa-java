package CodeForce;

import java.util.Scanner;

public class exe_A1521 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] A = new long[t];
		long[] B = new long[t];
		for (int i = 0; i < t; i++) {
			A[i] = scanner.nextLong();
			B[i] = scanner.nextLong();
		}
		scanner.close();
		//Solve + Output
		for (int i = 0; i < t; i++) {
			if (B[i] >= 3) {
				System.out.println("YES");
				System.out.println(A[i] + " " + A[i]*(B[i]-1) + " " +A[i]*B[i]);
			}else if (B[i] == 2) {
				System.out.println("YES");
				System.out.println(A[i]*2 + " " + A[i]*5 + " " + A[i]*7);
			}else if (B[i] == 1) {
				System.out.println("NO");
			}
		}
	}
}
