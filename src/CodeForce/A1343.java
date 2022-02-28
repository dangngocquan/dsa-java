package CodeForce;

import java.util.Scanner;

public class A1343 {	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res= new int[t];
		int[] k = new int[30];
		for (int i = 1; i < 30;i++) k[i] = (int)Math.pow(2, i) -1;
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			for (int j = 2; j < 30; j++) {
				if (n%k[j] == 0) {
					res[i] = n/k[j];
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
