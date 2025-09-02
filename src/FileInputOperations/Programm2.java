package FileInputOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Programm2 {
	
	public static void main(String[] args) throws IOException {
		File f = new  File("./sample.txt");
		
	if( !f.exists())
	
		System.out.println(f.createNewFile());
				
	
	
	Scanner s=new Scanner(f);
	
	while(s.hasNext()) {
		System.out.println(s.nextLine());
	}
		
	
	
	}

}
