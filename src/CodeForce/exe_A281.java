package CodeForce;

import java.util.Scanner;

public class exe_A281 {
	public static void main(String[] args) {
		//Input
		Scanner scanner =  new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		//Solve
		String res = str.substring(0,1).toUpperCase() + str.substring(1);
		//Output
		System.out.println(res);
		
	}
}
