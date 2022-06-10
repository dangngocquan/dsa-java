package other.test;

import java.util.ArrayList;

public class Test031 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(10);
		list.add("abx");
		System.out.println(list.get(0).getClass().getSimpleName());
		System.out.println(list.get(1).getClass().getSimpleName());
		Object obj1 = (Object)list.get(0);
		Object obj2 = (Object)list.get(1);
		list.set(0, obj2);
		list.set(1, obj1);
		System.out.println(list.get(0).getClass().getSimpleName());
		System.out.println(list.get(1).getClass().getSimpleName());
		
		ArrayList<Object> list1 = new ArrayList<>();
		System.out.println(list1 == null);
	}
}
