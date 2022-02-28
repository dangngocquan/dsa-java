package CodeForce;

import java.util.Scanner;

public class A822 {
	static int recursive(int k) {
		if (k==1) return 1;
		return k*recursive(k-1);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = Math.min(scanner.nextInt(), scanner.nextInt());
		scanner.close();
		//Output
		System.out.println(recursive(n));
	}
}
