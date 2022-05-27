package other.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test029 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextInt());
		}
	}
}
