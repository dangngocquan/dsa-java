package CodeForce;

import java.util.Scanner;

public class A959 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n%2==0) {
			System.out.println("Mahmoud");
		}else {
			System.out.println("Ehab");
		}
		scanner.close();
	}
}
