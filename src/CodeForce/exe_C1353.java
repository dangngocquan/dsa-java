package CodeForce;

import java.util.Scanner;

public class exe_C1353 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextInt();
		scanner.close();
		//Output
		// 8*1 + 16*2 + 24*3 + ...  = 8*1^2 + 8*2^2 + ... + 8* k^2 ; k = (n-1)/2;
		// 8 * (1^2 + 2^2 + ... + k^2) = 8*((1*2+2*3+...+k*(k+1) - (1+2+...+k)) = 8*(k*(k+1)*(k+2)/3 - k*(k+1)/2)
		for (int i = 0; i < t; i++) {
			long k = (long)((n[i]-1)/2);
			System.out.println(8*(k*(k+1)*(k+2)/3 - k*(k+1)/2));
		}
	}
}
