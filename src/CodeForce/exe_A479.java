package CodeForce;

import java.util.Scanner;

public class exe_A479 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		int x = a*b*c;
		if (x >res) res = x;
		x = (a+b)*c;
		if (x >res) res = x;
		x = a+b*c;
		if (x >res) res = x;
		x = a*(b+c);
		if (x >res) res = x;
		x = a*b+c;
		if (x >res) res = x;
		x = a+b+c;
		if (x >res) res = x;
		//Output 
		System.out.println(res);
	}
}
