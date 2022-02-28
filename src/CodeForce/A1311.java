package CodeForce;

import java.util.Scanner;

public class A1311 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a>b) {
				if ((a-b)%2==1) {
					res[i] = 2;
				}else {
					res[i] = 1;
				}
			}else if (a<b){
				if ((b-a)%2==1) {
					res[i] = 1;
				}else {
					res[i] = 2;
				}
			}
		}
		scanner.close();
		//Output
		for (int i: res) System.out.println(i);
	}
}
