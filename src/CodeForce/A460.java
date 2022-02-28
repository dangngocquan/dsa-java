package CodeForce;

import java.util.Scanner;

public class A460 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		//Solve
		int count = 0;
		while (n>0) {
			n -=1;
			count++;
			if (count%m==0) n++;
		}
		//Output
		System.out.println(count);
	}
}
