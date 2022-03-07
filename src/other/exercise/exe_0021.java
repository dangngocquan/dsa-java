//Bài 21. Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
//a)	Tính tổng các chữ số của n.
//b)	Phân tích n thành các thừa số nguyên tố. 

package other.exercise;

import java.util.*;

public class exe_0021 {
	static int getSum(int n) {
		int res = 0;
		while(n>0) {
			res += (n%10);
			n /= 10;
		}
		return res;
	}
	
	static String getPrime(int n) {
		String res = n+" = ";
		for (int i = 2; i <= n;i++) {
			int count = 0;
			while (n%i==0) {
				n /= i;
				count++;
			}
			if (count >0) {
				res += "("+i+"^"+count+").";
			}
		}
		return res.substring(0,res.length()-1);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so tu nhien n = ");
		int n = scanner.nextInt();
		scanner.close();
		//Solve + Output
		long begin = Calendar.getInstance().getTimeInMillis();
		System.out.println("a)	Tính tổng các chữ số của n.");
		System.out.println("  Result: "+ getSum(n));
		System.out.println("b)	Phân tích n thành các thừa số nguyên tố. ");
		System.out.println("  Result: "+ getPrime(n));
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
