package other.test;

class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return String.format("Author[name=%s,email=%s,gender=%s]", this.name, this.email, this.gender);
	}
}

class Book {
	private String name;
	private Author[] author;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author[] author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Author[] getAuthors() {
		return this.author;
	}
	
	public void setAuthors(Author[] authors) {
		this.author = authors;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		String ans = "";
		ans += "Book[name=" + this.name + ",author={";
		for (int i = 0; i < author.length; i++) {
			ans += author[i].toString() + ",";
		}
		ans = ans.substring(0,ans.length()-1);
		ans += "},price=" + this.price + ",qty=" + this.qty + "]";
		return ans;
	}
	
	public String getAuthorNames() {
		String ans = "";
		for (int i = 0; i < author.length; i++) {
			ans += author[i].getName() + ",";
		}
		return ans.substring(0,ans.length()-1);
	}
}

public class Test025 {
	public static void main(String[] args) {
		Author A = new Author("A", "a@gmail.com", 'm');
		Author B = new Author("B", "a@gmail.com", 'm');
		Author C = new Author("C", "a@gmail.com", 'm');
		Author D = new Author("D", "a@gmail.com", 'm');
		Author E = new Author("E", "a@gmail.com", 'm');
		
		Author[] arr1 = {A, B, C};
		Author[] arr2 = {C, D};
		
		Book book1 = new Book("book1", arr1, 100);
		System.out.println(book1.getAuthorNames());
		book1.setAuthors(arr2);
		System.out.println(book1.getAuthorNames());
	}
}
