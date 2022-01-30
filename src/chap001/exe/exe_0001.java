//Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b.
package chap001.exe;

import java.util.*;

public class exe_0001 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tim UCLN va BCNN cua 2 so a,b...");
		System.out.print("Nhap so tu nhien a:\t");
		int a = scanner.nextInt();
		System.out.print("Nhap so tu nhien b:\t");
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		int x = a;
		int y = b;
		while (x!=y) {
			if (x>y) {
				x -= y;
			}else {
				y -= x;
			}
		}
		//Output
		System.out.println("UCLN(a,b) = " + x);
		System.out.println("BCNN(a,b) = " + a*b/x);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
