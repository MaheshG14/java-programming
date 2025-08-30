
public class Equals {
	
	public static void main(String[] args) 
	{
		
		
		String s1 ="Mahesh"; // 1100 address
		
		String s2 = new String("Mahesh"); // 1011
		
		
	
		if(s1==s2)
		{
			 System.out.println("Same");
		}
		else if( s1.equals(s2))
		{
			System.out.println("Content is equals");
		} 
		else
		{
			System.out.println("Not same");
		}
	}

}
