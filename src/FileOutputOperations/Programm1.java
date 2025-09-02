package FileOutputOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Programm1 {
	
	public static void main(String[] args) throws IOException {
		File f = new  File("./sample1.txt");
		
	if( !f.exists())
	
		System.out.println(f.createNewFile());
				
	
	 
	FileOutputStream fos= new FileOutputStream(f);
	fos.write(67);
	fos.write(76);
	fos.write(85);
	fos.write(60);
	fos.write(23);
	fos.write(98);
	
	//fos.flush();
	fos.close();
	
	}

}
