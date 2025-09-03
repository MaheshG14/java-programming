package com.demo.ArrayHandler;

public class Demo3 
{
	
	public static void main(String[] args)
	{
		
		int numberArray []= {1,2,3,4,5,6,7,8};
		
	  for(int i=numberArray.length-1;i>0;i--)
	  {
		  System.out.print(numberArray[i]+" ");
	  }
	  
	  System.out.println();
	  
	  
	 System.out.println("Normal way of creating object");
	 // enhance for loop 
	 for(int num:numberArray)
		 System.out.print(num+" ");
	  
	}
}
