package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1474/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 1:44:14 AM -  Jun 25, 2022
 */
public class B1474 {
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int getMinPrime(int numMin) {
		int temp = numMin;
		while (!isPrime(temp) ) {
			temp++;
		}
		return temp;
	}
	
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int d = scanner.nextInt();
			int num1 = getMinPrime(1+d);
			int num2 = getMinPrime(num1+d);
			System.out.println(num1 * num2);
		}
		scanner.close();
	} 
}
