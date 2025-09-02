package Files;

import java.io.File;
import java.io.IOException;

public class Exit {
	public static void main(String[] args) throws IOException {
		
		File f= new File("D:\\Testfiles\\Mahesh.txt");
		
		if(f.exists())
		
			f.delete();
		
		System.out.println(f.createNewFile());
		
	}

}
