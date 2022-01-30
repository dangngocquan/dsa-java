//Bài 23. Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
//a)	Liệt kê n số nguyên tố đầu tiên.
//b)	Liệt kê n số Fibonaci đầu tiên. 

package chap001.exe;

import java.util.*;

public class exe_0023 {
	static List<Integer> getPrimeList(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		int temp = 3;
		while (list.size() < n) {
			boolean check = true;
			for (int i : list) {
				if (temp%i==0) {
					check = false;
					break;
				}
			}
			if (check) {
				list.add(temp);
			}
			temp += 1;
		}
		return list;
	}
	
	static List<Integer> getFibonaciList(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		if (n>1) {
			list.add(1);
			while (list.size() < n) {
				int size = list.size();
				list.add(list.get(size-1) + list.get(size-2));
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong n = ");
		int n = scanner.nextInt();
		scanner.close();
		//Solve + Output
		long begin = Calendar.getInstance().getTimeInMillis();
		System.out.println("a)	Liệt kê n số nguyên tố đầu tiên.");
		List<Integer> list1 = getPrimeList(n);
		System.out.println("Result: " + list1);
		System.out.println("b)	Liệt kê n số Fibonaci đầu tiên.");
		List<Integer> list2 = getFibonaciList(n);
		System.out.println("Result: " + list2);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
