package StringDemo;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String word="Varun Mahesh Mallikarjun Srinath";
		
		String[] wordArray= word.split(" ");
		
		for(String val : wordArray)
		{
			  System.out.println(val);
		}
	}

}
