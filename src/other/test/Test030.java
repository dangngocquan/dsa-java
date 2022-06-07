package other.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class Test030 {
	public static void main(String[] args) {
		Formatter output = null;
		try {
			output = new Formatter("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		output.format("%s\n", "abd");
		output.format("%s", "abd");
		output.close();
	}
}
