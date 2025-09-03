package com.demo.ArrayHandler;

public class Demo2 
{
	
	public static void main(String[] args)
	{
		
		int numberArray []= {1,2,3,4,5,6,7,8};
		
	  for(int i=0;i<numberArray.length;i++)
	  {
		  System.out.print(numberArray[i]+" ");
	  }
	  
	  System.out.println();
	  
	  for(int i=0;i<numberArray.length-1;i++)
	  {
		  System.out.print(numberArray[i]+" ");
	  }
	  
	  System.out.println();
	  
	  for(int i=1;i<numberArray.length-1;i++)
	  {
		  System.out.print(numberArray[i]+" ");
	  }
	  
	}
}
