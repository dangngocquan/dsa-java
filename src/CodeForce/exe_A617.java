package CodeForce;

import java.util.Scanner;

public class exe_A617 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		if (n % 5 ==0) {
			res = n/5;
		}else {
			res = n/5 +1;
		}
		//Output
		System.out.println(res);
	}
}
