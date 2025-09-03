package StringDemo;

import java.util.Scanner;

public class PanRegex {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String PanNumber="GWLPM2355B";
		
	//	String PanNumber = s.nextLine();
		
	 boolean pan =	PanNumber.matches("^[A-Z]{5}[0-9]{4}[A-Z]$");
	 
	 System.out.println();
	 
	 System.out.println("Your PanNumber is : "+pan);
	 
	 
	// System.out.println();
	// System.out.println("Your PanNumber is :"+pan);
	}
	

}
