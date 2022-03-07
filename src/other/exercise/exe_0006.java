//. Viết chương trình liệt kê n số nguyên tố đầu tiên.

package other.exercise;

import java.util.*;

public class exe_0006 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chuong trinh liet ke n so nguyen to dau tien ...");
		System.out.print("Nhap so n (n>0):\t");
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		List<Integer> primeList = new ArrayList<Integer>();
		primeList.add(2);
		int i = 3;
		while (primeList.size() < n) {
			boolean check = true;
			int x = (int)Math.sqrt(i);
			for (int j: primeList) {
				if (j>x) {
					break;
				}
				if (i%j==0) {
					check = false;
					break;
				}
			}
			if (check == true) {
				primeList.add(i);
			}
			i++;
		}
		//Output
		System.out.println("n so nguyen to dau tien:\t" + primeList);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
