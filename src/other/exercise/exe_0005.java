//Viết chương trình liệt kê tất cả các số nguyên tố nh�? hơn n cho trước.

package other.exercise;

import java.util.*;

public class exe_0005 {
	public static void main(String[] args) {
		//Input
		System.out.println("Liet ke cac so nguyen to nho hon N ...");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so N:\t");
		int N = scanner.nextInt();
		scanner.close();
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		List<Integer> primeList = new ArrayList<Integer>();
		if (N>=2) {
			primeList.add(2);
			for (int i = 3; i<= N; i++) {
				int x = (int)Math.sqrt(i);
				boolean check = true;
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
			}
		}
		//Output
		System.out.println("Cac so nguyen to < N: ");
		System.out.println(primeList);
		System.out.printf("Tong so:\t%d\n",primeList.size());
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
	
}
