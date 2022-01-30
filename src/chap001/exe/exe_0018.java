//Nhập một xâu ký tự. Đếm số từ của xâu ký tự đó. Thí dụ "   Trường    học  " có 2 từ.

package chap001.exe;

import java.util.*;

public class exe_0018 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap xau ki tu:");
		String str = scanner.nextLine();
		scanner.close();
		//solve
		long begin = Calendar.getInstance().getTimeInMillis();
		int res = 0;
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				str1 += str.charAt(i);
				continue;
			}
			if(str1 != "") {
				res++;
				str1 = "";
			}
		}
		if (str1 != "") res += 1;
		//Output
		System.out.println("Xau ki tu tren co "+res+" tu.");
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
