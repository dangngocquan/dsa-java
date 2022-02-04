package chap001.test;

import java.util.ArrayList;
import java.util.List;

public class test0008 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.remove(Integer.valueOf(2));
		System.out.println(list);
	}
}
