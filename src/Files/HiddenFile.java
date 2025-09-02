package Files;

import java.io.File;
import java.io.IOException;

public class HiddenFile {
	public static void main(String[] args) throws IOException {
		
     File f= new File("./Mahesh.txt");
		
		if(f.exists())
		
			f.delete();
		
		System.out.println(f.createNewFile());
		
	}

}
