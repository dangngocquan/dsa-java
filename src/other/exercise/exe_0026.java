//Bài 26. Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
//a)	Là số nguyên tố.
//b)	Là số thuận nghịch.
//c)	Tổng các chữ số của số đó là một số thuận nghịch

package other.exercise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class exe_0026 {
	static boolean isPrime(int n) {
		boolean check = true;
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n%i==0) {
				check = false;
				break;
			}
		}
		if (n <=1) check = false;
		return check;
	}
	
	static List<Integer> getPrimeList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i =1000000; i <= 9999999; i++) {
			if (isPrime(i)) list.add(i);
		}
		return list;
	}
	
	static boolean isReversibleNumber(int n) {
		boolean check = true;
		String str = Integer.toString(n);
		int length = str.length();
		for (int i = 0; i < (int)(length/2); i++) {
			if (str.charAt(i) != str.charAt(length - 1- i)) {
				check = false;
				break;
			}
		}
		return check;
	}
	
	static List<Integer> getReversibleNumberList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1000000; i <= 9999999; i++) {
			if (isReversibleNumber(i)) list.add(i);
		}
		return list;
	}
	
	static int getSumOfDigitsOfNumber(int n) {
		int res = 0;
		while (n >0) {
			res += (n%10);
			n /= 10;
		}
		return res;
	}
	
	static List<Integer> getResultList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1000000; i <= 9999999; i++) {
			if (isReversibleNumber(getSumOfDigitsOfNumber(i))) list.add(i);
		}
		return list;
	}
	
	public static void main(String[] args) {
//		 a)
		long begin1 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Bài 26. Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:");
		System.out.println("a)	Là số nguyên tố.");
		List<Integer> list1 = getPrimeList();
		System.out.println("Result: " + list1);
		System.out.println("Count: " + list1.size());
		long end1 = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end1-begin1));
//		 b)
		long begin2 = Calendar.getInstance().getTimeInMillis();
		System.out.println("b)	Là số thuận nghịch.");
		List<Integer> list2 = getReversibleNumberList();
		System.out.println("Result: " + list2);
		System.out.println("Count: " + list2.size());
		long end2 = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end2-begin2));
//		 c)
		long begin3 = Calendar.getInstance().getTimeInMillis();
		System.out.println("c)	Tổng các chữ số của số đó là một số thuận nghịch");
		List<Integer> list3 = getResultList();
		System.out.println("Result: " + list3);
		System.out.println("Count: " + list3.size());
		long end3 = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end3-begin3));
		
	}
}
