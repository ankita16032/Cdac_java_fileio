package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("d:\\Ankita\\MyFile1.txt");
			int k;
			while ((k = fis.read()) != -1) // -1 end of file.. read():read only one letter so while loop used
			{
				System.out.print((char) k);
			}
			fis.close();
		} catch (IOException e) {
			System.out.println("Error: Path is wrong for the file given...");
			System.out.println(e.getMessage());
		}
	}
}
