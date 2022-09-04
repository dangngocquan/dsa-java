package spoj;

import java.util.Scanner;

/**
 * <a href = "https://www.spoj.com/problems/ADFRUITS/"> Link </a>
 * @author Bris
 * @since 8:26:51 PM - Sep 3, 2022
 *
 */
public class ADFRUITS {
	public static String solve(String s1, String s2) {
		int index1 = s1.indexOf(s2.charAt(0) + "");
		int index2 = s2.indexOf(s1.charAt(0) + "");
		if (index1 == -1 && index2 == -1) {
			return s1 + s2;
		}else if (index1 == -1) {
			return s2.substring(0, index2+1) + solve(s1.substring(1), s2.substring(index2+1));
		}else if (index2 == -1) {
			return s1.substring(0, index1+1) + solve(s1.substring(index1+1), s2.substring(1));
		}else {
			String temp1 = s2.substring(0, index2+1) + solve(s1.substring(1), s2.substring(index2+1));
			String temp2 = s1.substring(0, index1+1) + solve(s1.substring(index1+1), s2.substring(1));
			return (temp1.length() < temp2.length())? temp1 : temp2;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String[] s = scanner.nextLine().split(" ");
			System.out.println(solve(s[0], s[1]));
		}
		scanner.close();
	}
}
