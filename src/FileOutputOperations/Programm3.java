package FileOutputOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Programm3 {
	
	public static void main(String[] args) throws IOException {
		File f = new  File("./sample3.txt");
		
	if( !f.exists())
	
		System.out.println(f.createNewFile());
				
	
	 
	BufferedWriter br=new BufferedWriter(new FileWriter(f));
	
	String s="Hellow Word 123";
	
	
	br.write(s);
	//fw.flush();
	br.close();
	
	}

}
