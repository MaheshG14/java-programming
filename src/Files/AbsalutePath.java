package Files;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

public class AbsalutePath {
	
	public static void main(String[] args) throws IOException 
	{
		File f= new File("C:\\Users\\LENOVO\\eclipse-workspace\\Practice-Programming\\resume.txt");
		
		
		System.out.println(f.getParent());
		
		 System.out.println(f.getAbsolutePath());
		 
		  System.out.println(new Date (f.lastModified()));
		  
		 
		
	}
	

}
