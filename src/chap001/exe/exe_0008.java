
//Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau. 
//Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855).

package chap001.exe;

import java.util.*;

public class exe_0008 {
	public static void main(String[] args) {
		//Input
		System.out.println("Liet ke cac so thuan nghich doc cos 6 chu so ...");
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 100000; i <= 999999;i++) {
			boolean check = true;
			if ((i/100000) != (i%10) || (i/10000)%10 != (i/10)%10 || (i/1000)%10 != (i/100)%10) {
				check = false;
			}
			if (check == true) {
				list.add(i);
			}
		}
		//Output
		System.out.println(list);
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
