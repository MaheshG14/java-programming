package Exception.handler;

public class RuntimeException2 
{
  
	public static void main(String[] args) 
	{
		
		 int result=0;
	     try {
		 result=1/0;
	     } 
	     catch(Exception ex) {
	    	 ex.printStackTrace();
	     }
	     
		System.out.println(result);
		 System.out.println("ArithmeticException");
	     
		
	}
	
	
}
