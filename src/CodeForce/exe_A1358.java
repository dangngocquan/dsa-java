package CodeForce;

import java.util.Scanner;

public class exe_A1358 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n*m)%2==0) {
				res[i] = (n*m)/2;
			}else {
				res[i] = n*(m/2) + n/2 + 1;
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
