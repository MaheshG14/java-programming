package Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) throws IOException 
	{
		File f= new File("D:\\Testfiles\\MyTest.txt");
		
		//f.createNewFile();
		
		System.out.println("Ceated Successfully  .....! : "+f.createNewFile());
	}

}
