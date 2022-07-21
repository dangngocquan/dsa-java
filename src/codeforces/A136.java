package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A136 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/136/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:20:53 PM -  Mar 17, 2022
 */
public class A136 {
	/**
	 * 
	 * This method is used to get the index of 'value' in the integer array 'arr'.
	 * 
	 * @param value is the value which you wnat to get index in the array 'arr'.
	 * @param arr is a integer array.
	 * @return Return the index of 'value' in integer array 'arr'.
	 */
	public static int findIndexOf(int value, int[] arr) {
		int res = 0;
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] == value) {
				res = i+1;
				break;
			}
		}
		return res;
	}
	
	/**
	 * 
	 * The main method - entry poit of this app.
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
		//res - is a integer array, store the result.
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
