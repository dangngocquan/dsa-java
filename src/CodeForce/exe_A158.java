package CodeForce;

import java.util.Scanner;

public class exe_A158 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i]= scanner.nextInt();
 		}
		scanner.close();
		//Solve
		int res = 0;
		if (arr[k]>0) {
			for (int i = k; i <= n; i++) {
				if (arr[i] == arr[k]) res = i; 
				else break;
			}
		}else {
			for (int i = k; i >= 0; i--) {
				if (arr[i] > 0) {
					res = i;
					break;
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
