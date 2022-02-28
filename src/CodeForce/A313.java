package CodeForce;

import java.util.Scanner;

public class A313 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Output
		if (n>=0) {
			System.out.println(n);
		}else {
			n= -n;
			if (n%10 > (n/10) %10) {
				System.out.println(-n/10);
			}else {
				System.out.println(-((n/100)*10+n%10));
			}
			
		}	
	}
}
