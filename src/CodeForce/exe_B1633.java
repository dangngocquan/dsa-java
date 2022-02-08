package CodeForce;

import java.util.Scanner;

public class exe_B1633 {
	static int getResult(char[] arr, int k) {
		if (k <=2) return 0;
		for (int i = 0; i <= arr.length-k; i++) {
			int x = getCoutn0(arr,i,i+k-1);
			int y = getCoutn1(arr,i,i+k-1);
			if (x > y) {
				return y;
			}else if (x < y) {
				return x;
			}else {
				return getResult(arr, k-1);
			}
		}
		return 0;
	}
	
	static int getCoutn1(char[] arr,int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (arr[i]=='1') count++;
		}
		return count;
	}
	
	static int getCoutn0(char[] arr, int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (arr[i]=='0') count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res =new int[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			char[] arr = s.toCharArray();
			res[i] = getResult(arr, s.length());
		}
		scanner.close();
		//Out
		for (int i : res) {
			System.out.println(i);
		}
		
	}
}
