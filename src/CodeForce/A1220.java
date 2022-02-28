package CodeForce;

import java.util.Scanner;

public class A1220 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		int count0 = 0;
		int count1 = 0;
		for (char i : s.toCharArray()) {
			if (i == 'z') {
				count0++;
			}else if (i == 'n') {
				count1++;
			}
		}
		//Output
		for (int i = 1; i <= count1; i++) System.out.print(1+ " ");
		for (int i = 1; i <= count0; i++) System.out.print(0+ " ");
	}
}
