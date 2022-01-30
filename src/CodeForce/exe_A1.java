package CodeForce;

import java.util.Scanner;

public class exe_A1 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		scanner.close();
		//Solve
		long res = 0;
		if (n%a!=0) {
			n=n/a+1;
		}else {
			n /= a;
		}
		if (m%a!=0) {
			m=m/a+1;
		}else {
			m /= a;
		}
		res= (long)n*m;
		//Output
		System.out.println(res);
		
	}
}
