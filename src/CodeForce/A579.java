package CodeForce;

import java.util.Scanner;

public class A579 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		while (x>0) {
			if (x %2==1) {
				res ++;
			}
			x /=2;
		}
		//Output
		System.out.println(res);
	}
}
