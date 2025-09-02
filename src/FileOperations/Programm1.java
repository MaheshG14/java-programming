package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Programm1 {
	
	public static void main(String[] args) throws IOException {
		File f = new  File("./sample.txt");
		
	if( !f.exists())
	
		System.out.println(f.createNewFile());
				
	
	  FileInputStream fis = new FileInputStream(f);
	//System.out.println(fis.read());
	
	int result;
	
	while((result= fis.read()) !=-1) {
          System.out.print((char)result);
	}
	
	
	fis.close();
	
	
	}

}
