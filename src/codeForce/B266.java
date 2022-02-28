package codeForce;

import java.util.Scanner;

public class B266 {
	static char[] getchange(char[] arr) {
		char[] res = new char[arr.length];
		for (int i= 0; i < res.length; i++) {
			if (i == res.length - 1) {
				res[i] = arr[i];
				continue;
			}
			if (arr[i] == 'B' && arr[i+1] == 'G' ) {
				res[i] = 'G';
				res[i+1] = 'B';
				i +=1;
			}else {
				res[i] = arr[i];
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		char[] arr = s.toCharArray();
		for (int i = 1; i <= t; i++) {
			arr = getchange(arr);
		}
		//Output
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
	}
}
