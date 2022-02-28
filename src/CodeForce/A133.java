package CodeForce;

import java.util.Scanner;

public class A133 {
	static boolean isHQ9(char c) {
		boolean check = false;
		if (c == 'H' || c == 'Q'|| c == '9') {
			check = true;
		}
		return check;
	}
	
	static boolean check(char[] arr, int start, int end, int count) {
		boolean res = false;
		for (int i = start; i <= end; i++) {
			if ((char)(arr[i]+count) =='9'|| arr[i] == '+') continue;
			if (isHQ9((char)(arr[i]+count))) {
				res = true;
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		String res = "NO";
		char[] a = s.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isHQ9(a[i])) {
				res = "YES";
				break;
			}else if (a[i] == '+') {
				count++;
				if (check(a, 0, i,count)) {
					res = "YES";
					break;
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
