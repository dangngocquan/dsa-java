package codeForce;

import java.util.Scanner;

public class A1335 {
	static int getResult(int n) {
		int res = 0;
		if (n%2 == 1) {
			res = n - (n+1)/2;
		}else {
			res = n - (n+2)/2;
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Input + Solve
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int  i = 0; i < t ; i++) {
			res[i] = getResult(scanner.nextInt());
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
		
	}
}
