package luyencode;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class VT09 {
	static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> primeSet = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (isPrime(x)) primeSet.add(x);
		}
		scanner.close();
		//Output
		for (int i : primeSet) System.out.print(i + " ");
	}
}
