package StringDemo;

public class Aadharnumber {
	
	public static void main(String[] args) {
		
		String aadhar2="268558707212";
		
		AadharInput(aadhar2);
	}
	
	public static void AadharInput(String aadharinput)
	{
		String aadhargerex="^[2-9][0-9]{11}$";
		
		 boolean aadhar1= aadharinput.matches(aadhargerex);
		 
		
		  System.out.println(aadhar1);
	}
	

}
