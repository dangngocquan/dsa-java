//Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số b bất kì (1< b≤ 36).
package chap001.exe;

import java.util.*;

public class exe_0002 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chuyen he co so...");
		System.out.print("Nhap so N (he co so 10):\t");
		int N = scanner.nextInt();
		System.out.print("Nhap he co so b muon chuyen doi (1< b <=36):\t");
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		String res = "";
		while (N>0) {
		int x = N%b;
		if (x < 10) {
			res = N%b + res;
		}else {
			res = (char)('A' + (x-10)) + res;
		}
		N /= b;
		}
		System.out.println("Result:\t" + res);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
