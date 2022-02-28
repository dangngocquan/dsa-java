package CodeForce;

import java.util.Scanner;

public class A9 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int max = Math.max(scanner.nextInt(), scanner.nextInt());
		scanner.close();
		//Solve
		int k = 6+1-max;
		//Output
		if (6%k==0) {
			System.out.println(1+"/"+(6/k));
		}else if (k%2==0) {
			System.out.println((k/2) + "/" + 3);
		}else {
			System.out.println(k+"/" + 6);
		}
	}
}
