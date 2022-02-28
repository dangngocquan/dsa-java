package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class A339 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		//Solve
		String res = "";
		int n = str.length()/2 + 1;
		char[] arr = new char[n];
		int index = 0;
		for (int i = 0; i < str.length(); i+=2) {
			arr[index] = str.charAt(i);
			index++;
		}
		Arrays.sort(arr);
		for (int i = 0; i < n ; i++) {
			res += "+" + arr[i];
		}
		//Output
		System.out.println(res.substring(1));
	}
}
