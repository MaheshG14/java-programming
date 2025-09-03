package StringDemo;

public class Problem4 {
	
	public static void main(String[] args) {
		
		String name = "mahesh"; 
		
		boolean matches1=   name.matches("^[a-z]+$");
		
		boolean matches2=   name.matches("^[A-Z]+$");
		
		boolean matches3=   name.matches("^[a-zA-Z]+$");
		
		System.out.println(matches1);
		System.out.println(matches2);
		System.out.println(matches3);
	}

}
