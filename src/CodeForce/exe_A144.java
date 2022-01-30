package CodeForce;

import java.util.Scanner;

public class exe_A144 {
	static int getIndexOfMinValue(int[] arr) {
		int res = 0;
		int minValue = 1000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= minValue) {
				minValue = arr[i];
				res = i;
			}
		}
		return res;
	}
	
	static int getIndexOfMaxValue(int[] arr) {
		int res = 0;
		int maxValue = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
				res = i;
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
		int res = 0;
		int indexMin = getIndexOfMinValue(a);
		int indexMax = getIndexOfMaxValue(a);
		if (indexMin < indexMax) {
			res = (n-1) - indexMin + indexMax-0 -1;
		}else {
			res = (n-1) - indexMin + indexMax-0;
		}
		//Output
		System.out.println(res);
		
	}
}
