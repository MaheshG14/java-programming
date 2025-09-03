package StringDemo;

public class NumberRegex {
	
	public static void main(String[] args) {
		
		String phoneNumberRegex="8008416418";
		
		boolean regex= phoneNumberRegex.matches("^[6-9][0-9]{9}$");
		
		System.out.println(regex);
		
	}

}
