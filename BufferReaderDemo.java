package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		
		//File file = new File("d:\\Ankita\\MyFile.txt");
		FileReader fr = new FileReader("d:\\Ankita\\MyFile.txt");
		
		BufferedReader br = new BufferedReader(fr,200);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
	}

}
