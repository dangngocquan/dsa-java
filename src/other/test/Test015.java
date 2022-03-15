package other.test;

import java.util.Scanner;

public class Test015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = 0;
		boolean check = false;
		while(!check) {
			try {
				System.out.println("Input n: ");
				n = Double.parseDouble(scanner.next());
				scanner.close();
				check = true;
			}catch (Exception e) {
				System.out.println("Error! ");
			}
		}
		System.out.println(n);
	}
}


