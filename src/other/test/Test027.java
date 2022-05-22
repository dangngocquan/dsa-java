package other.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test027 {
	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException err) {
			System.err.println("123");
			
		} catch (SecurityException err) {
			System.err.println("111");
		} finally {
			in.close();
			out.close();
		}
		
	}
}
