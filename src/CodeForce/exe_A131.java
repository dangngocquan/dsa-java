package CodeForce;

import java.util.Scanner;

public class exe_A131 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		//Solve
		String res = "";
		if(str.equals(str.toUpperCase())) {
			res = str.toLowerCase();
		}else if (str.substring(1).equals(str.substring(1).toUpperCase())) {
			res = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
		}else {
			res = str;
		}
		//Output
		System.out.println(res);
	}
}
