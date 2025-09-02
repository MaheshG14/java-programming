package Files;

import java.io.File;
import java.io.IOException;

public class CreateFolder {

	
public static void main(String[] args) throws IOException {
		
		File f= new File("./Resources.txt");
		
		System.out.println(f.mkdirs());
		
	//	if(f.exists())
		
		//	f.delete();
		
	//	System.out.println(f.createNewFile());
		
	}
}
