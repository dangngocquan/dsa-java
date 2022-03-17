package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B158 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/158/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:13:02 PM -  Mar 17, 2022
 */
public class B158 {
	/**
	 * 
	 * This method is used to get the number of 'value' in the integer array 'arr'.
	 * 
	 * @param value is the value that we will get the number of it in 'arr'.
	 * @param arr is a integer array.
	 * @return Return a Integer data type - the number of 'value' in the integer array 'arr'.
	 */
	public static int getCountOfValue(int value, int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i== value) count++;
		}
		return count;
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
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		int number1 = getCountOfValue(1, s);
		int number2 = getCountOfValue(2, s);
		int number3 = getCountOfValue(3, s);
		int number4 = getCountOfValue(4, s);
		int res = number4;
		if (number3 >= number1) {
			res += number3 + (number2+1)/2;
		}else {
			res += number3;
			number1 -= number3;
			if (number2%2==0) {
				res += number2/2 + (number1+3)/4;
			}else {
				res += number2/2 + (2+number1+3)/4;
			}
		}
		//Output
		System.out.println(res);
	}
}
