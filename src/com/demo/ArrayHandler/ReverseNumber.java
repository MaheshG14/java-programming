package com.demo.ArrayHandler;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int originalnumber=545;
		
		int rem=0;
		int rev=0;
		
		int inputnumber=originalnumber;
		
		while(inputnumber>0)
		{
			rem=inputnumber%10;
			rev=rev*10+rem;
			
			inputnumber=inputnumber/10;
		}
		
		if(originalnumber ==rev)
		{
			System.out.println(originalnumber+" It is palimdrome number");
		}
		else
			System.out.println(originalnumber+" It is Not palimdrome number");
	}

}
