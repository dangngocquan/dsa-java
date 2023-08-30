package codePTIT;

import java.io.*;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) {
        String path = "Hello.txt";
        StringBuilder result = new StringBuilder("");
        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
