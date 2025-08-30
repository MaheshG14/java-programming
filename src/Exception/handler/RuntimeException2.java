package Exception.handler;

public class RuntimeException2 
{
  
	public static void main(String[] args) 
	{
		
		 int result=0;
	     try {
		 result=1/0;
		 
	     } 
	     catch(ArithmeticException ex) {
	    	 ex.printStackTrace();
	    	 
	     }
	     catch(Exception ex) {
	    	 ex.printStackTrace();
	    	 
	     }
	     
	     finally
	     {
	    	 System.out.println("1234567");
	     }
		System.out.println(result);
	//	stem.out.println("ArithmeticException");
	     

	}
	
	
}
