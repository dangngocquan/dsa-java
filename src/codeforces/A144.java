package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A144 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/144/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:34:58 PM -  Mar 17, 2022
 */
public class A144 {
	/**
	 * 
	 * This method is used to get the index of the minimum value of the integer array 'arr'.
	 * 
	 * @param arr is a integer array.
	 * @return Return a integer data type - the index of the minimum value in integer array 'arr'.
	 */
	public static int getIndexOfMinValue(int[] arr) {
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
	
	/**
	 * 
	 * This method is used to get the index of the maximum value of the integer array 'arr'.
	 * 
	 * @param arr is a integer array.
	 * @return Return a integer data type - the index of the maximum value in integer array 'arr'.
	 */
	public static int getIndexOfMaxValue(int[] arr) {
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
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
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
		//res - the minimum number of seconds the colonel will need to form a line-up the general will like.
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
