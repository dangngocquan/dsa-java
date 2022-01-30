//Bài 22. Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
//a)	Liệt kê các ước số của n. Có bao nhiêu ước số.
//b)	Liệt kê các ước số là nguyên tố của n.

package chap001.exe;

import java.util.*;

public class exe_0022 {
	static List<Integer> getDivisorList(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				list.add(i);
			}
		}
		return list;
	}
	
	static List<Integer> getPrimeList(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i=2; i <= n; i++) {
			if (n%i==0) {
				list.add(i);
			}
			while (n%i==0) {
				n /= i;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so tu nhien n = ");
		int n = scanner.nextInt();
		scanner.close();
		//Solve + Output
		long begin = Calendar.getInstance().getTimeInMillis();
		System.out.println("a)	Liệt kê các ước số của n. Có bao nhiêu ước số.");
		List<Integer> list1 = getDivisorList(n);
		System.out.println("Result: " + list1);
		System.out.println("Count : " + list1.size());
		System.out.println("b)	Liệt kê các ước số là nguyên tố của n.");
		List<Integer> list2 = getPrimeList(n);
		System.out.println("Result: " + list2);
		System.out.println("Count : " + list2.size());
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
