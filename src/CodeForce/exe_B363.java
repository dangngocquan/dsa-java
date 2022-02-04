package CodeForce;

import java.util.Scanner;

public class exe_B363 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] h = new int[n+1];
		int minSum = Integer.MAX_VALUE;
		int sum = 0;
		int res = 0;
		for (int i = 1; i <= n; i++) {
			h[i] = scanner.nextInt();
			if (i<k) {
				sum += h[i];
			}else if (i==k) { 
				sum += h[i];
				if (sum<=minSum) {
					minSum = sum;
					res = i-k+1; 
				}
			}else if (i>k) {
				sum += h[i] - h[i-k];
				if (sum<=minSum) {
					minSum = sum;
					res = i-k+1;
				}
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	
	}
}
