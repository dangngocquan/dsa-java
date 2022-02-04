package CodeForce;

import java.util.Scanner;

public class exe_A1512 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int defautlNumber = -1;
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if (b == a && b == c) {
				defautlNumber = b;
			}else if (a==b){
				defautlNumber = a;
				res[i] = 3;
			}else if (a==c) {
				defautlNumber = a;
				res[i] = 2;
			}else if (b==c){
				defautlNumber = b;
				res[i] = 1;
			}
			for (int j = 4; j <= n; j++) {
				if (scanner.nextInt() != defautlNumber) res[i] = j;
			}
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
