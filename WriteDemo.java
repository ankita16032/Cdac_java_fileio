package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d:\\Ankita\\MyFile.txt");
		FileOutputStream out = new FileOutputStream("d:\\Ankita\\newFile.txt");
		int i;
		while ((i = fr.read()) != -1) {
			out.write(i);
		}
	}

}
