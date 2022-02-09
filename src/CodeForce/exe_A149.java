package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_A149 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int[] a = new int[13];
		int sum = 0;
		for (int i =1; i <= 12; i++) {
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		scanner.close();
		//Solve
		Arrays.sort(a);
		int res = 0;
		if (sum < k) {
			res = -1;
		}else {
			int sum1 = 0;
			for (int i = 12; i >= 0; i--) {
				if (sum1 >= k) {
					res = 12-i;
					break;
				}else {
					sum1 += a[i];
				}
 			}
		}
		//Output
		System.out.println(res);
		
	}
}
