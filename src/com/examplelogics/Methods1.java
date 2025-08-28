package com.examplelogics;

public class Methods1 {

	public static void main(String[] args) 
	
	{
		
		int a=1747;
		int b=485;
		// TODO Auto-generated method stub
		
		       int add =add(a,b);
				{
		        	System.out.println("Addition result : "+add);
				}
				
				int sub =sub(a,b);
						{
					System.out.println("subResult :"+ sub);
						}
		
		    	 int multi=multi(a,b);
	        	 {
							  System.out.println("Multi Result :"+ multi);
						 }
		    	 int div =div(a,b);
						 {
							System.out.println("Div Result :"+ div);
				
						 }
						 
								
	}
		 private static int add(int a, int b)
		 {
			 return a+b;
		 }
		 
		 private static int sub(int a, int b)
		 {
			 return a-b;
		 }
          
		 
		 private static int multi(int a, int b)
		 {
			 return a*b;
		 }
		 
		 private static int div(int a ,int b)
		 {
		     return a/b;	 
		 }
	

}
