package CodeForce;

import java.util.Scanner;

public class A935 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 1;
		for (int i = 2; i <= n; i++) {
			int count = 0;
			while (n%i==0) {
				n /= i;
				count++;
			}
			res *= (count+1);
		}
		//Output
		System.out.println(res - 1);
	}
}
