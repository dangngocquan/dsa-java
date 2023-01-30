package cses.IntroductoryProblems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Bris
 * @since 7:57:09 PM - Jan 20, 2023
 *
 */
public class Task1622 {
	public static StringBuilder str;
	public static Set<String> set;
	public static char[] chars;
	public static boolean[] isUsed;
	public static StringBuilder tempStr;
	public static int tempSize = 0;
	
	public static void find(int indexFinding) {
		if (indexFinding == chars.length) {
			set.add(tempStr.toString());
			if (set.size() > tempSize) {
				tempSize = set.size();
				str.append(tempStr.toString());
				str.append("\n");
			}
		}else {
			for (int i = 0; i < chars.length; i++) {
				if (!isUsed[i]) {
					tempStr.append(chars[i]);
					isUsed[i] = true;
					find(indexFinding+1);
					isUsed[i] = false;
					tempStr.deleteCharAt(indexFinding);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		chars = scanner.next().toCharArray();
		Arrays.sort(chars);
		str = new StringBuilder();
		tempStr = new StringBuilder();
		set = new TreeSet<>();
		isUsed = new boolean[chars.length];
		find(0);
		str.insert(0, tempSize + "\n");
		System.out.println(str);
		scanner.close();
	}
}
