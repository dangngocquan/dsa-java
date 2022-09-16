package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1409/D"> Link </a>
 * @author Bris
 * @since 10:06:15 PM - Sep 16, 2022
 *
 */
public class D1409 {
	public static void update(char[] arr, int index) {
		if (arr[index] < '9') {
			arr[index] = (char)(arr[index] + 1);
		}else {
			arr[index] = '0';
			update(arr, index-1);
		}
	}
	
	public static int sumArr(char[] arr) {
		int sum = 0;
		for (int i = 0; i < 19; i++) {
			sum += arr[i] - '0';
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String n = scanner.next();
			int s = scanner.nextInt();
			
			char[] arr = new char[19];
			for (int i = 0; i < 19; i++) {
				arr[i] = '0';
			}
			for (int i = 18, j = n.length()-1; j >= 0; i--, j--) {
				arr[i] = n.charAt(j);
			}
			int tempSum = sumArr(arr);
			for (int i = 18; i >= 1; i--) {
				if (tempSum <= s) {
					break;
				}else {
					arr[i] = '0';
					update(arr, i-1);
					tempSum = sumArr(arr);
				}
			}
			String str = "";
			for (char i : arr) {
				str += i;
			}
			System.out.println(Long.valueOf(str) - Long.valueOf(n));
		}
		scanner.close();
	}
}
