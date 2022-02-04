package CodeForce;

import java.util.Scanner;

public class exe_A492 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		//1
		//1 2 = 3
		//1 2 3 = 6
		// 1*2/2 + 2*3/2 +... + res*(res+1)/2 = n
		//1*2 + 2*3 +... + res*(res+1) = 2n
		//res*(res+1)*(res+2)/3 = 2n;
		//res*(res+1)*(res+2) = 6n;
		for (int i = 1; i <= n+1; i++) {
			if (i*(i+1)*(i+2) > 6*n) {
				res = i-1;
				break;
			}
		}
		//Output
		System.out.println(res);
	}
}
