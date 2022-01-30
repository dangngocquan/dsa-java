package CodeForce;

import java.util.Scanner;

public class exe_A136 {
	static int findIndexOf(int value, int[] arr) {
		int res = 0;
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] == value) {
				res = i+1;
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		int[] res = new int[n];
		for (int i = 0; i <n; i++) {
			res[i] = findIndexOf(i+1, a);
		}
		//Output
		for (int i: res) {
			System.out.print(i+" ");
		}
		
	}
}
