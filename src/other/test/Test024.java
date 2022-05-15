package other.test;

class A {
	public int x = 10;
	
	public void display() {
		System.out.println(x);
	}
}

class B extends A {
	public int x = 20;
	public void display() {
		System.out.println(x);
	}
}

public class Test024 {
	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}
