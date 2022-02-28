package luyenCode;

import java.util.Scanner;

public class VL05 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int ans = 0;
		n = 3*n + 1;
		if (n%2==0) {
			ans = -n/2;
		}else {
			ans = -n/2 + n;
		}
		//Output
		System.out.println(ans);
	}
}
