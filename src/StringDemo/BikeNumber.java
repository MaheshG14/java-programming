package StringDemo;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class BikeNumber {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	//	String Bikenumber="TS02ED5184";
		
		String Bikenumber = s.nextLine();
		
	 boolean bikenumber =	Bikenumber.matches("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$");
	 
	 System.out.println();
	 
//	 System.out.println("Your BikeNumber is : "+bikenumber);
	 
	 
	// System.out.println();
	 System.out.println("Your BikeNumber is :"+bikenumber);
	}
	 
	
	

}
