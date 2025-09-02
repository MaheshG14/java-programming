package Files;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
	
	public static void main(String[] args) throws IOException 
	{
		File f= new File("D:\\Testfiles\\MyTest.txt");
		
		//f.createNewFile();
		
		f.delete();
		
		System.out.println("Ceated Successfully  .....! : "+f.createNewFile());
		
	//	System.out.println(f.delete());
		 System.out.println(f.exists());
	}

}
