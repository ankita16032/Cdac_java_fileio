package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d:\\Ankita\\MyFile.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
