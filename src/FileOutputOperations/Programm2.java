package FileOutputOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Programm2 {
	
	public static void main(String[] args) throws IOException {
		File f = new  File("./sample2.txt");
		
	if( !f.exists())
	
		System.out.println(f.createNewFile());
				
	
	 
	FileWriter fw= new FileWriter(f);
	
	String s="Hellow Word";
	
	
	fw.write(s);
	//fw.flush();
	fw.close();
	
	}

}
