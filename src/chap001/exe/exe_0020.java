//Nhập một số tự nhiên n. Hãy liệt kê các số Fibonaci nhỏ hơn n là số nguyên tố. 

package chap001.exe;

import java.util.*;

public class exe_0020 {
	static List<Integer> getPrimeList(int n) {
		List<Integer> list = new ArrayList<Integer>();
		if (n>2) {
			list.add(2);
			for (int i = 3; i <= n; i++) {
				boolean check = true;
				int x = (int)Math.sqrt(i);
				for (int j: list) {
					if (j>x) break;
					if (i%j==0) {
						check = false;
						break;
					}
				}
				if (check) {
					list.add(i);
				}
			}
		}
		return list;
	}
	
	static List<Integer> getFibonacciList(int n) {
		List<Integer> list = new ArrayList<Integer>();
		if (n>0) {
			list.add(1);
			list.add(1);
			int size = 2;
			while (list.get(size-1) + list.get(size-2) <= n) {
				list.add(list.get(size-1) + list.get(size-2));
				size = list.size();
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
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		List<Integer> primeList = new ArrayList<Integer>();
		List<Integer> fibinacciList = new ArrayList<Integer>();
		List<Integer> resultList = new ArrayList<Integer>();
		primeList = getPrimeList(n);
		fibinacciList = getFibonacciList(n);
		for (int i: fibinacciList) {
			if (primeList.contains(i)) resultList.add(i);
		}
		//Output
		System.out.println("Result: "+resultList.size());
		System.out.println(resultList);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
