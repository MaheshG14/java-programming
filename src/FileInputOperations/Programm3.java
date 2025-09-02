package FileInputOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Programm3 {
	
	public static void main(String[] args) throws IOException {
		File f = new  File("./sample.txt");
		
	if( !f.exists())
	
		System.out.println(f.createNewFile());
				
	FileReader  fr  = new  FileReader(f);
	//System.out.println(fis.read());
	
	int result;
	
	while((result= fr.read()) !=-1) {
          System.out.print((char)result);
	}

	fr.close();
	
	
	}

}
