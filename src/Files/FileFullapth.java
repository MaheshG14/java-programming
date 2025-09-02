package Files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileFullapth {
	
	public static void main(String[] args) throws IOException 
	{
		File f= new File("C:\\Users\\LENOVO\\eclipse-workspace\\Practice-Programming");
		
		
		// By using list method 
		
		System.out.println(Arrays.toString(f.list()));
		
		System.out.println(Arrays.toString(f.listFiles()));
		
	}
	

}
