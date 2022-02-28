package CodeForce;

import java.util.Scanner;

public class A80 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		//Solve + Output
		int[] a = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
		for (int i = 0; i <a.length-1; i++) {
			if (a[i] == n) {
				if (a[i+1] == m) {
					System.out.println("YES");
					break;
				}else {
					System.out.println("NO");
					break;
				}
			}
		}
		if (n==a[a.length-1]) System.out.println("NO");
	}
}
